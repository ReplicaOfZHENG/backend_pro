package com.blockchainpro.sys.controller;

import com.blockchainpro.sys.entity.RegisterResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @PostMapping("/register")
    public RegisterResponse handleRegister(
            @RequestParam("type") Integer type,
            @RequestParam("user") String user,
            @RequestParam("pwd") String pwd) {

        // 校验用户类型
        if (type < 0 || type > 2) {
            return new RegisterResponse("用户类型不存在");
//            校验用户名长度
        } else if (user.length() > 15) {
            return new RegisterResponse("用户名过长");
        } else if (pwd.isEmpty()) {
            return  new RegisterResponse("密码为空");
        }
//        其他校验
        else {
            return new RegisterResponse("succeed");
        }
    }
}

