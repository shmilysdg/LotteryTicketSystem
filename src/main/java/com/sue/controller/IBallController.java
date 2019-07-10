package com.sue.controller;

public interface IBallController {
    /**
     * 根据颜色，号码和选取多少来调取相应的接口
     * @param color 颜色
     * @param num 号码
     * @param limit 选取最近几条
     * @return int 数量
     */
    int countNum(String color,String num,String limit);
}
