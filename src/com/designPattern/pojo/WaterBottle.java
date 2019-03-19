package com.designPattern.pojo;

/**
 * 水壶
 * 适配器模式
 * Created by HuaWeiBo on 2019/3/17.
 */
public class WaterBottle {

    /**
     * 容量(最多可以装水量)
     */
    private double capacity = 100;
    /**
     * 水桶中的水
     */
    private double volume;

    /**
     * 所需要装的水
     */
    private Water water;

    public WaterBottle(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Water getWater() {
        return water;
    }

    /**
     * 装水
     * @param water
     */
    public void setWater(Water water) {
        double volume = water.getVolume();
        if (capacity < volume) {
            volume = capacity;
        }
        this.volume = volume;
        // 可能一次性装不完,设置剩余多少水
        water.setVolume(water.getVolume() - volume);
        this.water = water;
    }
}
