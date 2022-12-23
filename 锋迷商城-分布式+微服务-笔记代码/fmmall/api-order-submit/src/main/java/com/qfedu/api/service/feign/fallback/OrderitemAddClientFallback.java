package com.qfedu.api.service.feign.fallback;

import com.qfedu.api.service.feign.OrderitemAddClient;
import com.qfedu.fmmall.beans.ShoppingCartVO;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderitemAddClientFallback implements OrderitemAddClient {

    @Override
    public int addOrderItem(List<ShoppingCartVO> list, String orderId) {
        System.out.println("stock-update-------服务降级");
        return 0;
    }
}
