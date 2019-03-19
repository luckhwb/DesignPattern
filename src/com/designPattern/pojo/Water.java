package com.designPattern.pojo;

/**
 * 水
 * 适配器模式
 * Created by HuaWeiBo on 2019/3/17.
 */
public class Water {

    private double volume;

    public Water(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
