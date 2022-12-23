package com.qfedu.shopcart.controller;

import com.qfedu.shopcart.service.ShopcartDelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopcartDelController {

    @Autowired
    private ShopcartDelService shopcartDelService;

    @DeleteMapping("/shopcart/del")
    public int delete(String cids){
        return shopcartDelService.deleteShopcart(cids);
    }

}
