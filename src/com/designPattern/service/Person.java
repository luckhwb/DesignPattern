package com.designPattern.service;

/**
 * 描述人的一天所做的事情
 * Created by h on 2019/3/19.
 */
public class Person {
    public void getUp(){
        System.out.println("起床----");
    }
    public void washFace(){
        System.out.println("洗脸----");
    }
    public void eat(){
        System.out.println("吃饭----");
    }
    public void work(){
        System.out.println("工作----");
    }
    public void sleep(){
        System.out.println("睡觉----");
    }

    /**
     * 使用外观模式，添加一个接口，来隐藏程序的复杂性
     */
    public void collect(){
        getUp();
        washFace();
        eat();
        work();
        sleep();
    }
}
