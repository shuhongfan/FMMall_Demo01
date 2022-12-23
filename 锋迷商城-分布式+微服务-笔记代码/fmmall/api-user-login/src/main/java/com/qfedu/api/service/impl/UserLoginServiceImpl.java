package com.qfedu.api.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qfedu.api.service.UserLoginService;
import com.qfedu.api.service.feign.UserCheckClient;
import com.qfedu.fmmall.beans.Users;
import com.qfedu.fmmall.utils.MD5Utils;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.TimeUnit;


@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserCheckClient userCheckClient;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public ResultVO checkLogin(String name, String pwd) {
        //1.调用user-check服务 根据用户名查询用户信息
        Users user = userCheckClient.check(name);

        //2.进行用户信息的校验
        if (user == null) {
            return new ResultVO(ResStatus.NO, "login fail...", null);
        } else {
            String md5Pwd = MD5Utils.md5(pwd);
            if (md5Pwd.equals(user.getPassword())) {
                //如果登录验证成功，则需要生成令牌token（token就是按照特定规则生成的字符串）
                //使用jwt规则生成token字符串
                JwtBuilder builder = Jwts.builder();
                String token = builder.setSubject(name)                     //主题，就是token中携带的数据
                        .setIssuedAt(new Date())                            //设置token的生成时间
                        .setId(user.getUserId() + "")               //设置用户id为token  id
                        .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000)) //设置token过期时间
                        .signWith(SignatureAlgorithm.HS256, "QIANfeng6666")     //设置加密方式和加密密码
                        .compact();

                //当用户登录成功之后，以token为key 将用户信息保存到reids
                try {
                    String userInfo = objectMapper.writeValueAsString(user);
                    stringRedisTemplate.boundValueOps(token).set(userInfo, 30, TimeUnit.MINUTES);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                return new ResultVO(ResStatus.OK, token, user);
            }else{
                return new ResultVO(ResStatus.NO, "login fail...", null);
            }
        }
    }
}

