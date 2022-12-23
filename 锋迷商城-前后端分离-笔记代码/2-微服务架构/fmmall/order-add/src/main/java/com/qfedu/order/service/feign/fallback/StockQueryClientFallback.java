package com.qfedu.order.service.feign.fallback;

import com.qfedu.fmmall.entity.ShoppingCartVO;
import com.qfedu.order.service.feign.StockQueryClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StockQueryClientFallback implements StockQueryClient {

    @Override
    public List<ShoppingCartVO> query(String cids) {
        System.out.println("stock-query------服务降级");
        return null;
    }
}
