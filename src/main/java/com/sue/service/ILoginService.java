package com.sue.service;

import com.sue.entity.Login;

public interface ILoginService {
    /**
     * 登录
     * @param userName
     * @param passWord
     * @return String
     */
    String login(String userName,String passWord);

    /**
     * 注册
     * @param userName
     * @param passWord
     * @return String
     */
    String register(String userName,String passWord);
}
