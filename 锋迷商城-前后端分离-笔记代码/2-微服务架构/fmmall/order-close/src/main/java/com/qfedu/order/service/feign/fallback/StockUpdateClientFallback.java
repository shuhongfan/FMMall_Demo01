package com.qfedu.order.service.feign.fallback;

import com.qfedu.fmmall.beans.ProductSku;
import com.qfedu.order.service.feign.StockUpdateClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockUpdateClientFallback implements StockUpdateClient {

    @Override
    public int update(List<ProductSku> skus) {
        System.out.println("stock-update ~~~~~ 服务降级");
        return 0;
    }
}
