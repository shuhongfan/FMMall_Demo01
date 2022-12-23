package com.qfedu.order.service.impl;

import com.qfedu.fmmall.entity.Orders;
import com.qfedu.order.dao.OrdersMapper;
import com.qfedu.order.service.OrderStatusUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusUpdateServiceImpl implements OrderStatusUpdateService {

    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public int updateStatus(Orders order) {
        int i = ordersMapper.updateByPrimaryKeySelective(order);
        return i;
    }
}
