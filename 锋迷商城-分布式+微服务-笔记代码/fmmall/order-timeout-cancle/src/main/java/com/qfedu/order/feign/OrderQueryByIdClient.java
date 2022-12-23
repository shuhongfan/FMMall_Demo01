package com.qfedu.order.feign;

import com.qfedu.fmmall.beans.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("order-querybyid")
public interface OrderQueryByIdClient {

    @GetMapping("/order/query/{oid}")
    public Orders query(@PathVariable("oid") String oid);


}
