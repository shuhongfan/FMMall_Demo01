package com.qfedu.order.feign.fallback;

import com.qfedu.fmmall.beans.Orders;
import com.qfedu.order.feign.OrderTimeoutQueryClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderTimeoutQueryClientFallback implements OrderTimeoutQueryClient {
    @Override
    public List<Orders> query() {
        System.out.println("order-timeout-query ~~~~~~~~~~ 服务降级");
        return new ArrayList<>();
    }
}
