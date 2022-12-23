package com.qfedu.order.service.impl;

import com.qfedu.fmmall.entity.Orders;
import com.qfedu.order.dao.OrdersMapper;
import com.qfedu.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public Orders queryOrderById(String orderId) {
        Orders orders = ordersMapper.selectByPrimaryKey(orderId);
        return orders;
    }
}
