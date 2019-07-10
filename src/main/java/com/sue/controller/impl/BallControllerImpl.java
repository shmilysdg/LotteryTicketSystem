package com.sue.controller.impl;

import com.sue.controller.IBallController;
import com.sue.service.IBallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ball")
public class BallControllerImpl implements IBallController {
    @Autowired
    private IBallService iBallService;
    /**
     * 根据颜色，号码和选取多少来调取相应的接口
     *
     * @param color 颜色
     * @param num   号码
     * @param issue 最近的期数
     * @return int 数量
     */
    @Override
    @RequestMapping("countNum")
    public int countNum(String color, String num, String issue) {
        int count = 0;
        if("red".equals(color)){
            switch (issue) {
                case "all":
                    count = iBallService.countRed(num);
                    break;
                case "3300":
                    count = iBallService.countRedLimit(num, 3300);
                    break;
                case "thousand":
                    count = iBallService.countRedLimit(num, 1600);
                    break;
                case "330":
                    count = iBallService.countRedLimit(num, 330);
                    break;
                case "hundred":
                    count = iBallService.countRedLimit(num, 160);
                    break;
                case "33":
                    count = iBallService.countRedLimit(num, 33);
                    break;
                case "sixteen":
                    count = iBallService.countRedLimit(num, 16);
                    break;
            }
        }else if("blue".equals(color)){
            switch (issue) {
                case "all":
                    count = iBallService.countBlue(num);
                    break;
                case "3300":
                    count = iBallService.countBlueLimit(num, 3300);
                    break;
                case "thousand":
                    count = iBallService.countBlueLimit(num, 1600);
                    break;
                case "330":
                    count = iBallService.countBlueLimit(num, 330);
                    break;
                case "hundred":
                    count = iBallService.countBlueLimit(num, 160);
                    break;
                case "33":
                    count = iBallService.countBlueLimit(num, 33);
                    break;
                case "sixteen":
                    count = iBallService.countBlueLimit(num, 16);
                    break;
            }
        }
        return count;
    }
}
