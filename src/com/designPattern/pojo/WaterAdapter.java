package com.designPattern.pojo;

/**
 * 人喝水-
 * 水Water,水壶WaterBottle,人无法直接喝水,需要将水放入水壶中,这时需要适配器
 * 适配器模式
 * Created by HuaWeiBo on 2019/3/17.
 */
public class WaterAdapter {
    private Water water;
    private WaterBottle waterBottle;

    public WaterAdapter(Water water, WaterBottle waterBottle) {
        this.water = water;
        this.waterBottle = waterBottle;
        this.waterBottle.setWater(water);
    }

    /**
     * 喝水
     * @param number
     */
    public void drinkWater(double number) {
        double volume = waterBottle.getVolume();
        if (volume == 0 && water.getVolume() != 0) {
            // 把剩余的水装进水壶
            waterBottle.setWater(water);
            volume = waterBottle.getVolume();
        } else if (volume == 0 && water.getVolume() == 0) {
            System.out.println("水不够了...");
            return;
        }
        double flag = number;
        if (number > volume) {
            flag = volume;
        }
        double v = volume - flag;
        waterBottle.setVolume(v);
        System.out.println("喝了" + flag + ",瓶里还有:" + waterBottle.getVolume());
        if (flag != number) {
            // 水壶剩余的水不够喝，判断是否还有水没有装进水壶中
            drinkWater(number - volume);
        }
    }
}
