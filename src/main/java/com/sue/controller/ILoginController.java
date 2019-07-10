package com.sue.controller;

public interface ILoginController {

    /**
     * 判断登陆
     * @param userName
     * @param password
     * @return String
     */
    String goLogin(String userName,String password);

    /**
     * 注册
     * @param userName
     * @param password
     * @return String
     */
    String register(String userName,String password);
}
