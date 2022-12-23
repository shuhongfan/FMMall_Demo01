package com.qfedu.api.service.feign;

import com.qfedu.api.service.feign.fallback.UserSaveClientFallback;
import com.qfedu.fmmall.beans.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "user-save",fallback = UserSaveClientFallback.class)
public interface UserSaveClient {

    @PostMapping("user/save")
    public int save(Users user);

}
