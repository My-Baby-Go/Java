package com.Test3;
/*
    定义一个猫类
    继承动物类
    实现跳高接口
    重写吃东西方法和跳高方法
    继承只能单继承和多 层 继承
    多继承只能在接口和接口之间完成
    实现接口则可以一次实现多个接口
 */
public class Cat extends Animal implements Jumping,Jumping2{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jumping() {
        System.out.println("猫学会了跳高");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jumping2() {
        System.out.println("测试实现多个接口成功");
    }
}
