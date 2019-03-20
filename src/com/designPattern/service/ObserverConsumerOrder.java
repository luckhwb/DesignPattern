package com.designPattern.service;

import com.designPattern.api.ObserverConsumer;

/**
 * 观察者模式
 * 即时消息消费者（监听者）
 * Created by h on 2019/3/20.
 */
public class ObserverConsumerOrder implements ObserverConsumer{

    @Override
    public void message(String message, int delayed) {
        System.out.println("order---》收到消息：" + message);
    }
}
