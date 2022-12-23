package com.qfedu.user.controller;

import com.qfedu.fmmall.entity.Users;
import com.qfedu.user.service.UserCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserCheckController {
    @Autowired
    private UserCheckService userCheckService;

    @GetMapping("/check")
    public Users check(String username){
        return userCheckService.queryUser(username);
    }

}
