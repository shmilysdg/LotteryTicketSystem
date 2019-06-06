package com.sue.service;


import com.sue.entity.User;

public interface IUserService {
    /**
     * 根据主键id查找user
     * @param userid 主键id
     * @return User
     */
    User findById(Integer userid);
}
