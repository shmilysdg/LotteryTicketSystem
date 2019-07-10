package com.sue.controller.impl;

import com.sue.controller.ILoginController;
import com.sue.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/springboot")
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
    @RequestMapping(value="goLogin",method = RequestMethod.POST)
    @Override
    public String goLogin(String userName, String password) {
        String message = loginService.login(userName,password);
        if("登录成功".equals(message)){
            return "redirect:/springboot/index";
        }else{
            return "redirect:/springboot/error";
        }
    }

    /**
     * 注册
     *
     * @param userName
     * @param password
     * @return String
     */
    @RequestMapping(value="register",method = RequestMethod.POST)
    @Override
    @ResponseBody
    public String register(String userName, String password) {
        return loginService.register(userName,password);
    }
    @RequestMapping("index")
    public String index(){
        return "pages/index.html";
    }
    @RequestMapping("error")
    public String error(){
        return "pages/error.html";
    }
}
