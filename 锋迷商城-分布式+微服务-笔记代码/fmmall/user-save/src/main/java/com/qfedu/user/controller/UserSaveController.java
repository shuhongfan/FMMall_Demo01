package com.qfedu.user.controller;

import com.qfedu.fmmall.entity.Users;
import com.qfedu.user.service.UserSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserSaveController {

    @Autowired
    private UserSaveService userSaveService;

    @PostMapping("/save")
    public int save(@RequestBody Users user){
        return userSaveService.saveUser(user);
    }

}
