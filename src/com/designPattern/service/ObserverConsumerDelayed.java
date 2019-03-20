package com.designPattern.service;

import com.designPattern.api.ObserverConsumer;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 观察者模式
 * 延时消息消费者（监听者）
 * Created by h on 2019/3/20.
 */
public class ObserverConsumerDelayed implements ObserverConsumer{
    private Map<String, List<String>> map = new HashMap<>();

    public ObserverConsumerDelayed() {
        listen();
    }

    @Override
    public void message(String message, int delayed) {
        new Thread(()->{
            try {
                Thread.sleep(delayed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("order---》收到消息：" + message);
        }).start();
    }
    public void messageMap(String message, int delayed) {
        long millis = delayed + System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = sdf.format(millis);
        System.out.println("延时执行时间：" + date);
        if (map.containsKey(date)) {
            map.get(date).add(message);
        } else {
            List<String> list = new ArrayList<>();
            list.add(message);
            map.put(date, list);
        }
    }
    public void listen() {
        System.out.println("开始监听：----");
        new Thread(()->{
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String dateStr = sdf.format(date);
                List<String> list = map.get(dateStr);
                if (list == null || list.size() == 0) {
                    continue;
                }
                for (String s:list) {
                    System.out.println("delayed---》收到消息：" + s + ",执行时间：" + dateStr);
                }
            }
        }).start();
    }
}
