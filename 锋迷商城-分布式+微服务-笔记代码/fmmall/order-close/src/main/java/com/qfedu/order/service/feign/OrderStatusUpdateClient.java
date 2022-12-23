package com.qfedu.order.service.feign;

import com.qfedu.fmmall.beans.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("order-status-update")
public interface OrderStatusUpdateClient {

    @PutMapping("/order/status/update")
    public int update(Orders order);

}
