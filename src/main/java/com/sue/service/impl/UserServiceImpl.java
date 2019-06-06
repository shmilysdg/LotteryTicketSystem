package com.sue.service.impl;

import com.sue.entity.User;
import com.sue.dao.UserMapper;
import com.sue.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findById(Integer userid) {
        return userMapper.selectByPrimaryKey(userid);
    }
}
