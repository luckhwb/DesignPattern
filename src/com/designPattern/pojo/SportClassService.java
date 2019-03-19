package com.designPattern.pojo;

import com.designPattern.api.Sports;

/**
 * 桥接模式：打印运动信息
 * Created by h on 2019/3/19.
 */
public class SportClassService extends SportClass{
    private int range;
    public SportClassService(int range, Sports sports) {
        super(sports);
        this.range = range;
    }

    @Override
    public void print() {
        sports.getTime(range);
    }
}
