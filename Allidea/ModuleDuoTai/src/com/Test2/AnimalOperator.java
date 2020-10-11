package com.Test2;

public class AnimalOperator {
    //创建动物吃东西方法
    public void useAnimal(Animal a){
        //利用多态访问各种动物的方法
        //Animal a=new Cat();
        //Animal a=new Dog();
        //Animal a=new Pig();
        a.eat();
    }
}
