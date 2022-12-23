package com.qfedu.orderitem.service;

import com.qfedu.fmmall.entity.OrderItem;

import java.util.List;

public interface OrderItemQueryService {

    public List<OrderItem> queryOrderItem(String orderId);

}
