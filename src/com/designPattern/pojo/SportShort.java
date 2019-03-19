package com.designPattern.pojo;

import com.designPattern.api.Sports;

/**
 * 矮
 * Created by h on 2019/3/19.
 */
public class SportShort implements Sports {
    @Override
    public void getTime(int range) {
        System.out.println("运动:" + range + "公里,消耗时间：" + range * 12 + "分钟");
    }
}
