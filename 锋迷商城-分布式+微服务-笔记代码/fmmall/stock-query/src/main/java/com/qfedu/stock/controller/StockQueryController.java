package com.qfedu.stock.controller;

import com.qfedu.fmmall.entity.ShoppingCartVO;
import com.qfedu.stock.service.StockQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StockQueryController {

    @Autowired
    private StockQueryService stockQueryService;

    @GetMapping("stock/query")
    public List<ShoppingCartVO> query(String cids){
        List<ShoppingCartVO> list = stockQueryService.selectShopcartByCids(cids);
        return list;
    }


}
