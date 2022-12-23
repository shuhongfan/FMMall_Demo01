package com.qfedu.order.service.feign.fallback;

import com.qfedu.fmmall.beans.Orders;
import com.qfedu.order.service.feign.OrderStatusUpdateClient;
import org.springframework.stereotype.Component;

@Component
public class OrderStatusUpdateClientFallback implements OrderStatusUpdateClient {

    @Override
    public int update(Orders order) {
        System.out.println("order-status-update ~~~~~ 服务降级");
        return 0;
    }
}
