package com.designPattern.test;

import com.designPattern.service.StrategyMap;

/**
 * 策略模式测试类
 * Created by h on 2019/3/18.
 */
public class StrategyTest {
    public static void main(String[] args) {
        int a = 4;
        System.out.println("策略模式-----------↓");
        StrategyMap strategyMap = new StrategyMap();
        strategyMap.print(a);

        System.out.println("常规操作-----------↓");
        if (a == 1) {
            System.out.println("今天周一,还没从周末缓过来.");
        } else if (a == 2) {
            System.out.println("今天周二,缓缓进入工作状态");
        } else if (a == 3) {
            System.out.println("今天周三,努力赶项目中.");
        } else if (a == 4) {
            System.out.println("今天周四,努力找bug中.");
        }else {
            System.out.println("我就是不给你说...");
        }

    }
}
