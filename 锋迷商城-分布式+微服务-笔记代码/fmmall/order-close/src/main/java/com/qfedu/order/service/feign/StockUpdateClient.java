package com.qfedu.order.service.feign;

import com.qfedu.fmmall.beans.ProductSku;
import com.qfedu.order.service.feign.fallback.StockUpdateClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "stock-update",fallback = StockUpdateClientFallback.class)
public interface StockUpdateClient {

    @PutMapping("/stock/update")
    public int update(List<ProductSku> skus);

}
