package com.designPattern.pojo;

import com.designPattern.api.Person;

/**
 * Created by h on 2019/3/14.
 */
public class ManPerson implements Person,Cloneable{

    @Override
    public String asy() {
        return "男生讲话啦";
    }

    @Override
    public String eat() {
        return "男生吃东西啦";
    }

    /**
     * 原型模式
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        ManPerson clone = (ManPerson) super.clone();
        return clone;
    }
}
