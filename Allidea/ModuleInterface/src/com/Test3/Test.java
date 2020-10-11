package com.Test3;
/*
    测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建猫对象，此处不用多态方式，因为猫类能同时调取接口和父类的方法，更方便
        Cat c=new Cat();
        c.setName("小猫");
        c.setAge(3);
        System.out.println(c.getName()+" ,"+c.getAge());
        c.eat();
        c.jumping();
        c.jumping2();
        System.out.println("--------");

        Cat c2=new Cat("大猫",4);
        System.out.println(c2.getName()+" ,"+c2.getAge());
        c.eat();
        c.jumping();
        System.out.println("--------");

        //创建狗对象
        Dog d1=new Dog();
        d1.setName("小狗");
        d1.setAge(3);
        System.out.println(d1.getName()+" ,"+d1.getAge());
        d1.eat();
        d1.jumping();
        System.out.println("--------");

        Dog d2=new Dog("大狗",4);
        System.out.println(d2.getName()+" ,"+d2.getAge());
        d2.eat();
        d2.jumping();
    }
}
