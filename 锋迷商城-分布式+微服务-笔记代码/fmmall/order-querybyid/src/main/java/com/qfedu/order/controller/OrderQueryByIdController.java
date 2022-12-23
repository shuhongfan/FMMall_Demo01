package com.qfedu.order.controller;

import com.netflix.discovery.converters.Auto;
import com.qfedu.fmmall.entity.Orders;
import com.qfedu.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderQueryByIdController {

   @Autowired
   private OrderService orderService;

    @GetMapping("/order/query/{oid}")
    public Orders query(@PathVariable("oid") String oid){
        return orderService.queryOrderById(oid);
    }


}
