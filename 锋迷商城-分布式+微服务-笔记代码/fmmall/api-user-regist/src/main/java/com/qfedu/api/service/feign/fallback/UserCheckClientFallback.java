package com.qfedu.api.service.feign.fallback;

import com.qfedu.api.service.feign.UserCheckClient;
import com.qfedu.fmmall.beans.Users;
import org.springframework.stereotype.Component;

@Component
public class UserCheckClientFallback implements UserCheckClient {
    @Override
    public Users check(String username) {
        System.out.println("user-check ~~~~~~~ 服务降级");
        return new Users();
    }
}
