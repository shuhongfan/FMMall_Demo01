package com.qfedu.order.controller;

import com.qfedu.order.service.OrderCloseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderCloseController {
    @Autowired
    private OrderCloseService orderCloseService;

    @GetMapping("/order/close")
    public int close(String orderId,int closeType){
        int i = orderCloseService.closeOrder(orderId,closeType);
        return i;
    }


}
