package com.qfedu.product.sku.controller;

import com.qfedu.fmmall.entity.ProductSku;
import com.qfedu.product.sku.service.ProductSkuQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductSkuQueryController {

    @Autowired
    private ProductSkuQueryService productSkuQueryService;

    @GetMapping("/product/sku/query")
    public ProductSku query(String skuId){
        return productSkuQueryService.queryProductSku(skuId);
    }


}
