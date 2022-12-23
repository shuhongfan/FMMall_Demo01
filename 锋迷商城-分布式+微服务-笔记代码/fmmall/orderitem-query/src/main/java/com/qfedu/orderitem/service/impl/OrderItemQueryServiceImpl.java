package com.qfedu.orderitem.service.impl;

import com.qfedu.fmmall.entity.OrderItem;
import com.qfedu.orderitem.dao.OrderItemMapper;
import com.qfedu.orderitem.service.OrderItemQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class OrderItemQueryServiceImpl implements OrderItemQueryService {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Override
    public List<OrderItem> queryOrderItem(String orderId) {
        Example example1 = new Example(OrderItem.class);
        Example.Criteria criteria1 = example1.createCriteria();
        criteria1.andEqualTo("orderId", orderId);
        List<OrderItem> orderItems = orderItemMapper.selectByExample(example1);
        return orderItems;
    }
}
