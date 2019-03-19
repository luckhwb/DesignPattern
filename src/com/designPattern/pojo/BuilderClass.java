package com.designPattern.pojo;

/**
 * 建造者实体类
 * Created by HuaWeiBo on 2019/3/14.
 */
public class BuilderClass {
    private int id;
    private String name;
    private int age;
    private int sex;
    private String language;
    private BuilderClass(){}
    private static BuilderClassBuilder builderClassBuilder =
            new BuilderClass().new BuilderClassBuilder();

    public static BuilderClassBuilder getBuilder() {
        return builderClassBuilder;
    }
    public class BuilderClassBuilder{
        private int id;
        private String name;
        private int age;
        private int sex;
        private String language;
        public BuilderClass build() {
            BuilderClass builderClass = new BuilderClass();
            builderClass.id = id;
            builderClass.age = age;
            builderClass.name = name;
            builderClass.sex = sex;
            builderClass.language = language;
            return builderClass;
        }
        public BuilderClassBuilder setId(int id) {
            this.id = id;
            return this;
        }
        public BuilderClassBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public BuilderClassBuilder setAge(int age) {
            this.age = age;
            return this;
        }
        public BuilderClassBuilder setSex(int sex) {
            this.sex = sex;
            return this;
        }
        public BuilderClassBuilder setLanguage(String language) {
            this.language = language;
            return this;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "BuilderClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", language='" + language + '\'' +
                '}';
    }
}
