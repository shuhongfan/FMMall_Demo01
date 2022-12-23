package com.qfedu.user.service.impl;

import com.qfedu.fmmall.entity.Users;
import com.qfedu.user.dao.UserMapper;
import com.qfedu.user.service.UserCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserCheckServiceImpl implements UserCheckService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Users queryUser(String name) {
        Example example = new Example(Users.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username",name);
        List<Users> users = userMapper.selectByExample(example);
        if(users.size()>0){
            return users.get(0);
        }else{
            return null;
        }
    }
}
