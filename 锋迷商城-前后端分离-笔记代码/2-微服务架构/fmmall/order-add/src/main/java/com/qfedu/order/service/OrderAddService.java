package com.qfedu.order.service;

import com.qfedu.fmmall.entity.Orders;
import com.qfedu.fmmall.entity.ShoppingCartVO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface OrderAddService {

    public List<ShoppingCartVO> save(@RequestBody Orders order, String cids);

}

