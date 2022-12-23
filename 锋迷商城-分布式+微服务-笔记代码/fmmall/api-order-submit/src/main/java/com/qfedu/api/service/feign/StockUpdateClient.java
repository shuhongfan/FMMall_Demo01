package com.qfedu.api.service.feign;

import com.qfedu.api.service.feign.fallback.StockUpdateClientFallback;
import com.qfedu.fmmall.beans.ProductSku;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "stock-update",fallback = StockUpdateClientFallback.class)
public interface StockUpdateClient {

    @PutMapping("/stock/update")
    public int update(List<ProductSku> skus);

}
