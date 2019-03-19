package com.designPattern.service;

import com.designPattern.api.StrategyApi;
import com.designPattern.pojo.StrategyMonday;
import com.designPattern.pojo.StrategyThursday;
import com.designPattern.pojo.StrategyTuesday;
import com.designPattern.pojo.StrategyWednesday;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略类
 * Created by h on 2019/3/18.
 */
public class StrategyMap {
    private Map<Integer, StrategyApi> map = new HashMap<>();

    public StrategyMap() {
        map.put(1, new StrategyMonday());
        map.put(2, new StrategyTuesday());
        map.put(3, new StrategyWednesday());
        map.put(4, new StrategyThursday());
    }
    public void addStrategyApi(Integer integer, StrategyApi strategyApi){
        map.put(integer, strategyApi);
    }
    public void print(Integer integer) {
        StrategyApi strategyApi = map.get(integer);
        if (strategyApi == null) {
            System.out.println("我就是不给你说...");
        }
        strategyApi.print();
    }
}
