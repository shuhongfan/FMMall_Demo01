package com.qfedu.order.service.feign;

import com.qfedu.fmmall.entity.ShoppingCartVO;
import com.qfedu.order.service.feign.fallback.StockQueryClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "stock-query",fallback = StockQueryClientFallback.class)
public interface StockQueryClient {

    @GetMapping("/stock/query")
    public List<ShoppingCartVO> query(@RequestParam("cids") String cids);

}
