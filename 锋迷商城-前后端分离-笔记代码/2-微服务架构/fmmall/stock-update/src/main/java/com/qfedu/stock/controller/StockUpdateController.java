package com.qfedu.stock.controller;

import com.qfedu.fmmall.entity.ProductSku;
import com.qfedu.stock.service.StockUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StockUpdateController {

    @Autowired
    private StockUpdateService stockUpdateService;

    @PutMapping("/stock/update")
    public int update(@RequestBody List<ProductSku> skus){
        return stockUpdateService.updateStock(skus);
    }


}
