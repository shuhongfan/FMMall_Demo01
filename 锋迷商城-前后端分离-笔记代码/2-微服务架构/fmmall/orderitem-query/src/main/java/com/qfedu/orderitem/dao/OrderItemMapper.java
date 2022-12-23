package com.qfedu.orderitem.dao;

import com.qfedu.fmmall.entity.OrderItem;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@Repository
public interface OrderItemMapper extends Mapper<OrderItem>, MySqlMapper<OrderItem> {
}
