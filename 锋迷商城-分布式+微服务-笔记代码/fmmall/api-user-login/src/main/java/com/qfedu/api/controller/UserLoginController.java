package com.qfedu.api.controller;

import com.qfedu.api.service.UserLoginService;
import com.qfedu.fmmall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @GetMapping("/user/login")
    public ResultVO login(@RequestParam("username") String name,
                          @RequestParam(value = "password") String pwd){
        ResultVO resultVO = userLoginService.checkLogin(name, pwd);
        return resultVO;
    }

}
