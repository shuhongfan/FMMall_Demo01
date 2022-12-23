package com.qfedu.orderitem.service;

import com.qfedu.fmmall.entity.OrderItem;
import com.qfedu.fmmall.entity.ShoppingCartVO;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Random;

public interface OrderItemAddService {

    public int save(List<ShoppingCartVO> list, String orderId);
}
