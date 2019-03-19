package com.designPattern.pojo;

import com.designPattern.api.Sports;

/**
 * 高
 * Created by h on 2019/3/19.
 */
public class SportHigh implements Sports {
    @Override
    public void getTime(int range) {
        System.out.println("运动:" + range + "公里,消耗时间：" + range * 10 + "分钟");
    }
}
