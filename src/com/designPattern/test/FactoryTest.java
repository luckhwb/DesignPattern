package com.designPattern.test;

import com.designPattern.api.Person;
import com.designPattern.service.Factory;

/**
 * 工厂模式
 * Created by HuaWeiBo on 2019/3/14.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Person man = Factory.newPerson("woman");
        System.out.println("工厂方法:" + man.asy());
        Person person = Factory.newManPerson();
        System.out.println("简单工厂:" + person.asy());

    }
}
