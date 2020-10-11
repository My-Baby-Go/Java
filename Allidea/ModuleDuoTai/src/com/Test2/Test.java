package com.Test2;

public class Test {
    public static void main(String[] args) {
        //创建动物操作对象
        AnimalOperator ao=new AnimalOperator();
        //创建猫对象
        Cat c=new Cat();
        //用动物对象传递猫吃东西的方法
        ao.useAnimal(c);

        Animal d=new Dog();
        ao.useAnimal(d);

        Animal p=new Pig();
        ao.useAnimal(p);
    }
}
