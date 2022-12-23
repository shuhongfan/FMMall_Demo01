package com.qfedu.api.service.feign.fallback;


import com.qfedu.api.service.feign.OrderAddClient;
import com.qfedu.fmmall.beans.Orders;
import com.qfedu.fmmall.beans.ShoppingCartVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderAddClientFallback implements OrderAddClient {
    @Override
    public List<ShoppingCartVO> saveOrder(Orders order, String cids) {
        System.out.println("order-add-------服务降级");
        return null;
    }
}
