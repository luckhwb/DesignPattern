package com.designPattern.test;

import com.designPattern.service.ObserverProducer;

/**
 * 观察者模式
 * Created by HuaWeiBo on 2019/3/20.
 */
public class ObserverTest {
    public static void main(String[] args) {
        ObserverProducer observerProducer = new ObserverProducer();
        observerProducer.send("order", "我是顺序消息.");
        for (int i = 1; i < 5; i++) {
            observerProducer.send("delayed", "我是延时消息."+i, i*1000);
        }
    }
}
