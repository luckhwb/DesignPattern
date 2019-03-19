package com.designPattern.test;

import com.designPattern.service.Person;

/**
 * 外观模式
 * Created by HuaWeiBo on 2019/3/19.
 */
public class FacadeTest {
    public static void main(String[] args) {
        // 一般描述人的一天所做的事情(将逐一调用很复杂)
        Person person = new Person();
        person.getUp();
        person.washFace();
        person.eat();
        person.work();
        person.sleep();
        System.out.println("-------------------------------");
        // 外观模式（已将复杂的步骤编写一次，并提供简易接口）
        person.collect();
    }
}
