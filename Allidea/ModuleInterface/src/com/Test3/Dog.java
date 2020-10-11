package com.Test3;
/*
    创建一个狗类
    具体参考猫类注释
 */
public class Dog extends Animal implements Jumping{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jumping() {
        System.out.println("狗学会了跳高");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
