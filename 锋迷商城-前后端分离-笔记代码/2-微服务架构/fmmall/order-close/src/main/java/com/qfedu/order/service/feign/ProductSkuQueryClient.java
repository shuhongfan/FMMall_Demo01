package com.qfedu.order.service.feign;

import com.qfedu.fmmall.beans.ProductSku;
import com.qfedu.order.service.feign.fallback.ProductSkuQueryClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "product-sku-query",fallback = ProductSkuQueryClientFallback.class)
public interface ProductSkuQueryClient {

    @GetMapping("/product/sku/query")
    public ProductSku query( @RequestParam("skuId") String skuId);

}
