package com.Test1;

public class Zi extends Fu{
   public int age=20;
    public Zi(){
        super(20);
        System.out.println("子类的无参构造方法");
    }
    public Zi(int age){
        super(20);
        System.out.println("子类的有参构造方法");
    }
    /*public void show(){
        int age=18;
        //访问方法内变量
        System.out.println("访问方法内变量"+age);
        //访问本类中成员变量
        System.out.println("访问本类中成员变量"+this.age);
        //访问父类中成员变量
        System.out.println("访问父类中成员变量"+super.age);
    }*/
}
