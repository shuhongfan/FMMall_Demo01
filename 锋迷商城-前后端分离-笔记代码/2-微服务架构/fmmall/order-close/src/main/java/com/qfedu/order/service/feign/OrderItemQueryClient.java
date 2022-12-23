package com.qfedu.order.service.feign;

import com.qfedu.fmmall.beans.OrderItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("orderitem-query")
public interface OrderItemQueryClient {

    @GetMapping("/orderitem/query")
    public List<OrderItem> query(@RequestParam("orderId") String orderId);

}
