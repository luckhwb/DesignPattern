package com.designPattern.pojo;

import com.designPattern.api.Person;

/**
 * Created by HuaWeiBo on 2019/3/14.
 */
public class WoManPerson implements Person{

    @Override
    public String asy() {

        return "女生讲话了.";
    }

    @Override
    public String eat() {
        return "女生吃东西了.";
    }
}
