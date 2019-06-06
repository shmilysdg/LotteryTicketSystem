package com.sue.controller.impl;

import com.sue.controller.ILoginController;
import com.sue.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class LoginContollerImpl implements ILoginController {
    @Autowired
    private ILoginService loginService;
    /**
     * 登录
     *
     * @param userName
     * @param password
     * @return String
     */
    @RequestMapping("login")
    @Override
    public String login(String userName, String password) {
        return loginService.login(userName,password);
    }

    /**
     * 注册
     *
     * @param userName
     * @param password
     * @return String
     */
    @RequestMapping("register")
    @Override
    public String register(String userName, String password) {
        return loginService.register(userName,password);
    }
}
