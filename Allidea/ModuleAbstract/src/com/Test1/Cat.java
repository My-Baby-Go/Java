package com.Test1;
/*
    抽象类的子类：
    要不本身为抽象类
    要不就重写父类的所有抽象方法
    否则会报错
 */
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
