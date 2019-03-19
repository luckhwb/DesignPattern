package com.designPattern.test;

import com.designPattern.pojo.BuilderClass;

/**
 * 建造者模式
 * Created by HuaWeiBo on 2019/3/14.
 */
public class BuilderTest {
    public static void main(String[] args) {
        BuilderClass build = BuilderClass.getBuilder()
                .setId(1).setLanguage("中文").setName("xhga").build();
        System.out.println(build);
    }
}
