package com.designPattern.api;

/**
 * 观察者模式
 * 消费者接口
 * Created by h on 2019/3/20.
 */
public interface ObserverConsumer {
    void message(String message, int delayed);
}
