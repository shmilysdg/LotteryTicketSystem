package com.sue.service;

public interface IBallService {
    /**
     * 查询红球号码的数量
     * @param red 红球的号码
     * @return int 红球的数量
     */
    int countRed(String red);
    /**
     * 查询蓝球号码的数量
     * @param blue 蓝球的号码
     * @return int 蓝球的数量
     */
    int countBlue(String blue);

    /**
     * 查询最近几期的红球号码的数量
     * @param red 红球的号码
     * @param limit 最近的期数
     * @return int 红球的数量
     */
    int countRedLimit(String red, int limit);

    /**
     * 查询最近几期的蓝球号码的数量
     * @param blue 蓝球的号码
     * @param limit 最近的期数
     * @return int 蓝球的数量
     */
    int countBlueLimit(String blue, int limit);
}
