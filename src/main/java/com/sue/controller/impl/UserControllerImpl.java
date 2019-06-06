package com.sue.controller.impl;

import com.sue.controller.IUserController;
import com.sue.entity.User;
import com.sue.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserControllerImpl implements IUserController {
    @Autowired
    private IUserService iUserService;
    /**
     * @param userid 主键ID
     * @return User
     */
    @RequestMapping("findById")
    @Override
    public User findById(Integer userid) {
        return iUserService.findById(userid);
    }
}
