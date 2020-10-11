package com.Test2;
/*
    接口的成员变量只能是常量
    默认修饰符 public static final

    接口没有构造方法，因为接口主要是对行为进行抽象的，是没有具体存在的

    一个类如果没有父类，则默认继承Object类
    所有类都直接或间接继承Object

    成员方法只能是抽象方法
    默认修饰符public abstract
 */
public interface Inter {
    String name="接口";
    public static final int age=20;
    /*
        在接口中
        int age=20;
        等同于
        public static final int age=20;
     */

    /*
        public Inter(){};
        无法创建构造方法
     */

    //只能是抽象方法，抽象方法没有方法体
    void method();//等同于 public abstract void method();


}
