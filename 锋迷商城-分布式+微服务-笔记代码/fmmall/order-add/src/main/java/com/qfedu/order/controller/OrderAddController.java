package com.qfedu.order.controller;

import com.qfedu.fmmall.entity.Orders;
import com.qfedu.fmmall.entity.ShoppingCartVO;
import com.qfedu.order.service.OrderAddService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderAddController {

    @Autowired
    private OrderAddService orderAddService;

    @PostMapping("/order/save")
    public List<ShoppingCartVO> saveOrder(@RequestBody Orders order, String cids){
        System.out.println("--------------------order-add");
        List<ShoppingCartVO> list = orderAddService.save(order, cids);
        System.out.println(list);
        return list;
    }


}
