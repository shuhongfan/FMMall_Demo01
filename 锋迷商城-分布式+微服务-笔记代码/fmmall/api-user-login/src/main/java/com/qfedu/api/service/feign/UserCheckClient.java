package com.qfedu.api.service.feign;

import com.qfedu.api.service.feign.fallback.UserCheckClientFallback;
import com.qfedu.fmmall.beans.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-check",fallback = UserCheckClientFallback.class)
public interface UserCheckClient {

    @GetMapping("user/check")
    public Users check(@RequestParam("username") String username);

}
