package com.designPattern.pojo;

import com.designPattern.api.StrategyApi;

/**
 * 1
 * Created by h on 2019/3/18.
 */
public class StrategyMonday implements StrategyApi{

    @Override
    public void print() {
        System.out.println("今天周一,还没从周末缓过来.");
    }
}
