package com.designPattern.pojo;

import com.designPattern.api.Sports;

/**
 * 定义抽象类
 * Created by h on 2019/3/19.
 */
public abstract class SportClass {

    public Sports sports;

    public SportClass(Sports sports) {
        this.sports = sports;
    }

    // 打印运动信息
    public abstract void print();
}
