package com.designPattern.test;

import com.designPattern.pojo.ManPerson;

/**
 * 原型模式（克隆）
 * Created by HuaWeiBo on 2019/3/14.
 */
public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        ManPerson manPerson = new ManPerson();
        System.out.println(manPerson);
        System.out.println(manPerson.clone());
    }
}
