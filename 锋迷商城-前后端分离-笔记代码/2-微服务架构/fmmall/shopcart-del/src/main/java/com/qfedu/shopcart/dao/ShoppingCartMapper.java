package com.qfedu.shopcart.dao;

import com.qfedu.fmmall.entity.ShoppingCart;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@Repository
public interface ShoppingCartMapper extends Mapper<ShoppingCart>, MySqlMapper<ShoppingCart> {
}
