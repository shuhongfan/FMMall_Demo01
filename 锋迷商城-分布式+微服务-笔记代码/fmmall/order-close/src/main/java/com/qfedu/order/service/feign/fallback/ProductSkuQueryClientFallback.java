package com.qfedu.order.service.feign.fallback;

import com.qfedu.fmmall.beans.ProductSku;
import com.qfedu.order.service.feign.ProductSkuQueryClient;
import org.springframework.stereotype.Component;

@Component
public class ProductSkuQueryClientFallback implements ProductSkuQueryClient {

    @Override
    public ProductSku query(String skuId) {
        System.out.println("product-sku-query ~~~~~~~  服务降级");
        return null;
    }
}
