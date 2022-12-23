package com.qfedu.fmmall.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qfedu.fmmall.dao.CategoryMapper;
import com.qfedu.fmmall.entity.CategoryVO;
import com.qfedu.fmmall.service.CategoryService;
import com.qfedu.fmmall.vo.ResStatus;
import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    private ObjectMapper objectMapper = new ObjectMapper();
    /**
     * 查询分类列表（包含三个级别的分类）
     * @return
     */
    public ResultVO listCategories() {
        List<CategoryVO> categoryVOS = null;
        try {
            //1 .查询redis
            String cateories = stringRedisTemplate.boundValueOps("cateories").get();

            //2.判断
            if(cateories != null){
                JavaType javaType = objectMapper.getTypeFactory().constructParametricType(ArrayList.class, CategoryVO.class);
                categoryVOS = objectMapper.readValue(cateories, javaType);
            }else{
                //如果redis中沒有類別數據，則查詢數據庫
                categoryVOS = categoryMapper.selectAllCategories();
                String str = objectMapper.writeValueAsString(categoryVOS);
                stringRedisTemplate.boundValueOps("cateories").set(str,1, TimeUnit.DAYS);
            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        ResultVO resultVO = new ResultVO(ResStatus.OK, "success", categoryVOS);
        return resultVO;
    }

    /**
     * 查询所有一级分类，同时查询当前一级分类下销量最高的6个商品
     * @return
     */
    public ResultVO listFirstLevelCategories() {
        List<CategoryVO> categoryVOS = categoryMapper.selectFirstLevelCategories();
        ResultVO resultVO = new ResultVO(ResStatus.OK, "success", categoryVOS);
        return resultVO;
    }

}
