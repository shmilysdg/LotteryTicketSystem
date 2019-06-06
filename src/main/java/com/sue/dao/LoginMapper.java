package com.sue.dao;

import com.sue.entity.Login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoginMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(Integer userId);

    Login selectByUserName(@Param("userName") String userName);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
}