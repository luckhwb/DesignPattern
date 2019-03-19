package com.designPattern.service;

/**
 * 单例模式
 * Created by HuaWeiBo on 2019/3/14.
 */
public class Singleton {
    private Singleton (){}

    private static Singleton instance = null;

    private static Singleton instanceHungry = new Singleton();

    /**
     * 饿汉式
     * @return
     */
    public static Singleton getInstanceHungry() {
        return instanceHungry;
    }

    /**
     * 懒汉式:线程不安全
     * @return
     */
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 懒汉式:线程安全的
     * @return
     */
    public static Singleton getInstanceSynchronized(){
        if (instance == null) {
            synchronized (instance){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * 内部静态类
     * @return
     */
    public static Singleton getSingletonInnerClass() {
        return SingletonInstance.singleton;
    }
    private static class SingletonInstance {
        private static final Singleton singleton = new Singleton();
    }
}
