package com.qfedu.orderitem.controller;

import com.qfedu.fmmall.entity.OrderItem;
import com.qfedu.fmmall.entity.ShoppingCartVO;
import com.qfedu.orderitem.service.OrderItemAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderItemAddController {

    @Autowired
    private OrderItemAddService orderItemAddService;

    @PostMapping("/item/save")
    public int addOrderItem(@RequestBody List<ShoppingCartVO> list, String orderId){
        return orderItemAddService.save(list,orderId);
    }

}
