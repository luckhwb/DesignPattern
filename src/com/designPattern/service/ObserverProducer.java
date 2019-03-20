package com.designPattern.service;

import com.designPattern.api.ObserverConsumer;

import java.util.HashMap;
import java.util.Map;

/**
 * 观察者模式
 * 生产者（被监听）
 * Created by h on 2019/3/20.
 */
public class ObserverProducer {
    private Map<String, ObserverConsumer> map = new HashMap();

    public ObserverProducer() {
        map.put("order", new ObserverConsumerOrder());
        map.put("delayed", new ObserverConsumerDelayed());
    }

    public void send(String topic, String message) {
        if (topic == null || topic.length() == 0) {
            new Exception("err-主题不能为空...");
        }
        ObserverConsumer observerConsumer = map.get(topic);
        if (observerConsumer == null) {
            new Exception("err-找不到对应主题...");
        }
        observerConsumer.message(message, 0);
    }

    public void send(String topic, String message, int delayed) {
        if (delayed == 0) {
            send(topic, message);
            return;
        }
        if (topic == null || topic.length() == 0) {
            new Exception("err-主题不能为空...");
        }
        ObserverConsumerDelayed observerConsumer = (ObserverConsumerDelayed)map.get(topic);
        if (observerConsumer == null) {
            new Exception("err-找不到对应主题...");
        }
        observerConsumer.messageMap(message, delayed);
    }
}
