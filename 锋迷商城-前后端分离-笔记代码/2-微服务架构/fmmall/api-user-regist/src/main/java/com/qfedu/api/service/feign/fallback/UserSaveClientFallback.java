package com.qfedu.api.service.feign.fallback;

import com.qfedu.api.service.feign.UserSaveClient;
import com.qfedu.fmmall.beans.Users;
import org.springframework.stereotype.Component;

@Component
public class UserSaveClientFallback implements UserSaveClient {

    @Override
    public int save(Users user) {
        return 0;
    }
}
