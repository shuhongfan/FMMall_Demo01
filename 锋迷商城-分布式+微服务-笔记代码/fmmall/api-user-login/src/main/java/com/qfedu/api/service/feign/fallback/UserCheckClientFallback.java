package com.qfedu.api.service.feign.fallback;

import com.qfedu.api.service.feign.UserCheckClient;
import com.qfedu.fmmall.beans.Users;
import org.springframework.stereotype.Component;

@Component
public class UserCheckClientFallback implements UserCheckClient {

    public Users check(String username) {
        //如果调用user-check服务失败，则返回null
        System.out.println("user/check-----服务降级");
        return null;
    }

}
