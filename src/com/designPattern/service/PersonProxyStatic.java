package com.designPattern.service;

import com.designPattern.api.Person;
import com.designPattern.pojo.ManPerson;

/**
 * 代理模式-静态代理
 * Created by h on 2019/3/18.
 */
public class PersonProxyStatic implements Person {
    private Person person;

    public PersonProxyStatic(Person person) {
        this.person = person;
    }

    public void before(){
        System.out.println("静态代理-before:");
    }
    public void after(){
        System.out.println("静态代理-after:");
    }
    @Override
    public String asy() {
        // 装饰模式-装饰接口
        before();
        String asy = person.asy();
        after();
        return asy;
    }

    @Override
    public String eat() {
        // 装饰模式-装饰接口
        before();
        String eat = person.eat();
        after();
        return eat;
    }

}
