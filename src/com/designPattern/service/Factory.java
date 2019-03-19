package com.designPattern.service;

import com.designPattern.api.Person;
import com.designPattern.pojo.ManPerson;
import com.designPattern.pojo.WoManPerson;

/**
 * 工厂模式：简单工厂,工厂方法
 * Created by HuaWeiBo on 2019/3/14.
 */
public class Factory {
    /**
     * 工厂方法
     * 根据传入的值，返回对应的对象
     * @param value
     * @return
     */
    public static Person newPerson(String value) {
        if ("man".equals(value)) {
            return new ManPerson();
        } else if ("woman".equals(value)) {
            return new WoManPerson();
        }
        return null;
    }

    /**
     * 简单工厂
     * 对象由工厂创建
     * @return
     */
    public static Person newManPerson() {
        return new ManPerson();
    }

}
