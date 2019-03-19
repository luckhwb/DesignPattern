package com.designPattern.test;

import com.designPattern.api.Person;
import com.designPattern.pojo.ManPerson;
import com.designPattern.service.PersonProxyStatic;
import com.designPattern.service.PersonProxyDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 代理模式and装饰模式
 * Created by h on 2019/3/18.
 */
public class ProxyAndModifyTest {
    public static void main(String[] args) {
        // 动态代理
        Person person = new ManPerson();
        InvocationHandler handler = new PersonProxyDynamic(person);
        Person personProxyDynamic = (Person)Proxy.newProxyInstance(
                handler.getClass().getClassLoader(),
                person.getClass().getInterfaces(), handler);
        System.out.println("动态代理：" + personProxyDynamic.eat());
        // 静态代理
        PersonProxyStatic personProxyStatic = new PersonProxyStatic(person);
        System.out.println("静态代理：" + personProxyStatic.eat());
    }
}
