package com.qfedu.orderitem.service.impl;

import com.qfedu.fmmall.entity.OrderItem;
import com.qfedu.fmmall.entity.ShoppingCartVO;
import com.qfedu.orderitem.dao.OrderItemMapper;
import com.qfedu.orderitem.service.OrderItemAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class OrderItemAddServiceImpl implements OrderItemAddService {

    @Autowired
    private OrderItemMapper orderItemMapper;

    public int save(List<ShoppingCartVO> list, String orderId){
        int j = 1;
        for (ShoppingCartVO sc : list) {
            int cnum = Integer.parseInt(sc.getCartNum());
            String itemId = System.currentTimeMillis() + "" + (new Random().nextInt(89999) + 10000);
            OrderItem orderItem = new OrderItem(itemId, orderId, sc.getProductId(), sc.getProductName(), sc.getProductImg(), sc.getSkuId(), sc.getSkuName(), new BigDecimal(sc.getSellPrice()), cnum, new BigDecimal(sc.getSellPrice() * cnum), new Date(), new Date(), 0);
            int i = orderItemMapper.insert(orderItem);
            j *= i;
        }
        return j;
    }
}
