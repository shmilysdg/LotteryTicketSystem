package com.sue.service.impl;

import com.sue.dao.BallMapper;
import com.sue.service.IBallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BallServiceImpl implements IBallService {
    @Autowired
    private BallMapper ballMapper;
    /**
     * 查询红球号码的数量
     *
     * @param red 红球的号码
     * @return int 红球的数量
     */
    @Override
    public int countRed(String red) {
        return ballMapper.countRed(red);
    }

    /**
     * 查询蓝球号码的数量
     *
     * @param blue 蓝球的号码
     * @return int 蓝球的数量
     */
    @Override
    public int countBlue(String blue) {
        return ballMapper.countBlue(blue);
    }

    /**
     * 查询最近几期的红球号码的数量
     *
     * @param red   红球的号码
     * @param limit 最近的期数
     * @return int 红球的数量
     */
    @Override
    public int countRedLimit(String red, int limit) {
        return ballMapper.countRedLimit(red,limit);
    }

    /**
     * 查询最近几期的蓝球号码的数量
     *
     * @param blue  蓝球的号码
     * @param limit 最近的期数
     * @return int 蓝球的数量
     */
    @Override
    public int countBlueLimit(String blue, int limit) {
        return ballMapper.countBlueLimit(blue,limit);
    }
}
