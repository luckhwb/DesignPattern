package com.designPattern.pojo;

import com.designPattern.api.StrategyApi;

/**
 * 3
 * Created by h on 2019/3/18.
 */
public class StrategyWednesday implements StrategyApi{

    @Override
    public void print() {
        System.out.println("今天周三,努力赶项目中.");
    }
}
