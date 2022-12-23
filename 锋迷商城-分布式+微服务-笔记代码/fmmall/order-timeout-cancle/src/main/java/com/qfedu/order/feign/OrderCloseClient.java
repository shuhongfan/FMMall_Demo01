package com.qfedu.order.feign;

import com.qfedu.order.feign.fallback.OrderCloseClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "order-close",fallback = OrderCloseClientFallback.class)
public interface OrderCloseClient {

    @GetMapping("/order/close")
    public int close(@RequestParam("orderId") String orderId,
                     @RequestParam("closeType") int closeType);
}
