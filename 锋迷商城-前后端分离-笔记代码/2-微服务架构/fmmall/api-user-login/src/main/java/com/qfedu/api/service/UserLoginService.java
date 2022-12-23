package com.qfedu.api.service;

import com.qfedu.fmmall.vo.ResultVO;

public interface UserLoginService {
    //用户登录
    public ResultVO checkLogin(String name, String pwd);
}
