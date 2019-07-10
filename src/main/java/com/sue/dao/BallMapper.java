package com.sue.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BallMapper {
    int countRed(@Param("red") String red);
    int countBlue(@Param("blue") String blue);
    int countRedLimit(@Param("red") String red, @Param("limit") int limit);
    int countBlueLimit(@Param("blue") String blue, @Param("limit") int limit);
}