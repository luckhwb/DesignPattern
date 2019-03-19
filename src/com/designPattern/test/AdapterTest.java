package com.designPattern.test;

import com.designPattern.pojo.Water;
import com.designPattern.pojo.WaterAdapter;
import com.designPattern.pojo.WaterBottle;

/**
 * 适配器模式
 * 模拟喝水
 * Created by HuaWeiBo on 2019/3/17.
 */
public class AdapterTest {
    public static void main(String[] args) {
        // 水资源
        Water water = new Water(70);
        // 水壶
        WaterBottle waterBottle = new WaterBottle(30);
        // 适配器
        WaterAdapter waterAdapter = new WaterAdapter(water, waterBottle);
        waterAdapter.drinkWater(80);
        waterAdapter.drinkWater(3);
        waterAdapter.drinkWater(6);
        waterAdapter.drinkWater(6);
        waterAdapter.drinkWater(5);
        waterAdapter.drinkWater(5);
        waterAdapter.drinkWater(5);
    }
}
