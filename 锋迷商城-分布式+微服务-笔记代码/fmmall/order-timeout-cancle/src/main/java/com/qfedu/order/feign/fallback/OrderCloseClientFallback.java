package com.qfedu.order.feign.fallback;

import com.qfedu.order.feign.OrderCloseClient;
import org.springframework.stereotype.Component;

@Component
public class OrderCloseClientFallback implements OrderCloseClient {
    @Override
    public int close(String orderId, int closeType) {
        System.out.println("order-close ~~~~~~~~~~ 服务降级");
        return 0;
    }
}
