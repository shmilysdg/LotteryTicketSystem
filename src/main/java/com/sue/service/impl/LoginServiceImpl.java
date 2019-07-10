package com.sue.service.impl;

import com.sue.dao.LoginMapper;
import com.sue.entity.Login;
import com.sue.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    private LoginMapper loginMapper;

    /**
     * 登录
     *
     * @param userName
     * @param password
     * @return String
     */
    @Override
    public String login(String userName, String password) {
        Login login = loginMapper.selectByUserName(userName);
        if (login != null) {
            if (DigestUtils.md5DigestAsHex(password.getBytes()).equals(login.getPassword())){
                return "登录成功";
            } else {
                return "密码不正确";
            }
        }else {
            return "用户名不存在";
        }
    }

    /**
     * 注册
     *
     * @param userName
     * @param password
     * @return String
     */
    @Override
    public String register(String userName, String password) {
        if("" != userName && userName != null){
            Login user = loginMapper.selectByUserName(userName);
            if(user != null){
                return "该用户名已经存在";
            }else{
                if("" != password && password != null){
                    Login login = new Login();
                    login.setUserName(userName);
                    login.setPassword(DigestUtils.md5DigestAsHex(password.getBytes()));
                    Integer flag = loginMapper.insert(login);
                    if(flag == 1){
                        return "注册成功";
                    }else {
                        return "注册失败";
                    }
                }else {
                    return "请输入密码";
                }
            }

        }else {
            return "请输入用户名";
        }
    }
}
