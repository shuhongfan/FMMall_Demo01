package com.qfedu.fmmall.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qfedu.fmmall.dao.IndexImgMapper;
import com.qfedu.fmmall.entity.IndexImg;
import com.qfedu.fmmall.service.IndexImgService;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class IndexImgServiceImpl implements IndexImgService {

    @Autowired
    private IndexImgMapper indexImgMapper;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private ObjectMapper objectMapper = new ObjectMapper();

    public ResultVO listIndexImgs() {
        List<IndexImg> indexImgs = null;
        try {
            //1000个并发请求，请求轮播图
            String imgsStr = stringRedisTemplate.boundValueOps("indexImgs").get();

            //1000个请求查询到redis中的数据都是null
            if (imgsStr != null) {
                // 从redis中获取到了轮播图信息
                JavaType javaType = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, IndexImg.class);
                indexImgs = objectMapper.readValue(imgsStr, javaType);
            } else {
                //  1000个请求都会进入else  (service类在spring容器中是单例的，1000个并发会启动1000个线程来处理，但是公用一个service实例)
                synchronized (this){
                    // 第二次查询redis
                    String s = stringRedisTemplate.boundValueOps("indexImgs").get();
                    if(s == null){
                        // 这1000个请求中，只有第一个请求再次查询redis时依然为null
                        indexImgs = indexImgMapper.listIndexImgs();
                        if(indexImgs != null) {
                            stringRedisTemplate.boundValueOps("indexImgs").set(objectMapper.writeValueAsString(indexImgs));
                            stringRedisTemplate.boundValueOps("indexImgs").expire(1, TimeUnit.DAYS);
                        }else{
                            List<IndexImg> arr = new ArrayList<>();
                            stringRedisTemplate.boundValueOps("indexImgs").set(objectMapper.writeValueAsString(arr));
                            stringRedisTemplate.boundValueOps("indexImgs").expire(10, TimeUnit.SECONDS);
                        }
                    }else{
                        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, IndexImg.class);
                        indexImgs = objectMapper.readValue(s, javaType);
                    }
                }
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        //返回数据
        if(indexImgs != null){
            return new ResultVO(ResStatus.OK,"success",indexImgs);
        }else{
            return new ResultVO(ResStatus.NO,"fail",null);
        }

    }
}
