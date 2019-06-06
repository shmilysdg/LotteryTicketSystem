package com.sue.controller;

public interface ILoginController {
    /**
     * 登录
     * @param userName
     * @param password
     * @return String
     */
    String login(String userName,String password);

    /**
     * 注册
     * @param userName
     * @param password
     * @return String
     */
    String register(String userName,String password);
}
