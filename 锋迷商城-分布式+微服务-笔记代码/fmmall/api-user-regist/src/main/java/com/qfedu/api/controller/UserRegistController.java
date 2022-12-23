package com.qfedu.api.controller;

import com.qfedu.api.service.UserResgistService;
import com.qfedu.fmmall.beans.Users;
import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserRegistController {

    @Autowired
    private UserResgistService userResgistService;

    @PostMapping("user/regist")
    public ResultVO regist(@RequestBody Users user){
        ResultVO vo = userResgistService.regist(user.getUsername(), user.getPassword());
        return vo;
    }

}
