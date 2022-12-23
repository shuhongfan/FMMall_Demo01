package com.qfedu.api.service.feign.fallback;

import com.qfedu.api.service.feign.ShopcartDelClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ShopcartDelClientFallback implements ShopcartDelClient {

    public int delete(String cids) {
        System.out.println("shopcart-del ~~~~~~~ 服务降级");
        return 0;
    }

}
