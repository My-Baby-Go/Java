package com.Test1;
/*
    abstract    抽象类的创建
    抽象类可以没有抽象方法，但是有抽象方法的类一定要是抽象类

 */
public abstract class Animal {
    /*
        普通方法
        public void eat(){
            System.out.println(""吃东西);
        }
     */

    //抽象方法没有方法体,一般用于限定子类必须完成某些动作
    public abstract void eat();

    //抽象类可以有成员变量
    public String name="动物";
    public final int age=3;

    //抽象类可以有成员方法
    public void run(){
        System.out.println("动物会跑步");
    }

    //抽象类可以有构造方法,一般用于子类访问父类数据的初始化
    public Animal(){}

    public Animal(String name){
        this.name=name;
    }
}
