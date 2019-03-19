package com.designPattern.test;

import com.designPattern.service.Singleton;

/**
 * 单例模式
 * Created by HuaWeiBo on 2019/3/14.
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instanceHungry = Singleton.getInstanceHungry();
        Singleton instance = Singleton.getInstance();
        Singleton instanceSynchronized = Singleton.getInstanceSynchronized();
        Singleton singletonInnerClass = Singleton.getSingletonInnerClass();
    }
}
