package com.sue.controller;

import com.sue.entity.User;

public interface IUserController {
    /**
     *
     * @param userid 主键ID
     * @return User
     */
    User findById(Integer userid);
}
