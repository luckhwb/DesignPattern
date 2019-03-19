package com.designPattern.service;

import com.designPattern.api.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理模式-动态代理
 * Created by h on 2019/3/18.
 */
public class PersonProxyDynamic implements InvocationHandler {

    private Object object;

    public PersonProxyDynamic(Person person) {
        this.object = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 修饰模式-修饰接口
        System.out.println("动态代理-before:");
        Object invoke = method.invoke(object, args);
        System.out.println("动态代理-after:");
        return invoke;
    }
}
