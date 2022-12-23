package com.qfedu.order.feign;

import com.qfedu.fmmall.beans.Orders;
import com.qfedu.order.feign.fallback.OrderTimeoutQueryClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "order-timeout-query",fallback = OrderTimeoutQueryClientFallback.class)
public interface OrderTimeoutQueryClient {

    @GetMapping("/order/query/timeout")
    public List<Orders> query();
}
