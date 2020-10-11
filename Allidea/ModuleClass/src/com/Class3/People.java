package com.Class3;

public class People {
    String name;
    //使用privat关键字修饰成员变量
    private int age;

    public void setAge(int age){
        //在方法中对年龄进行限制
        if(age<0||age>150)
        {
            System.out.println("您输入的你年龄有误");
        }
        else {
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }

    //构造方法
    public People(){
        System.out.println("这是一个构造方法");
    }

    public void show(){
        System.out.println("名字是："+name+", 年龄是："+age);
    }
}
