package com.Class1;

public class PhoneTest {
    public static void main(String[] args) {
        //创建对象
        PhoneClass p=new PhoneClass();
        //使用成员变量
        p.brand="华为";
        p.price=5999;
        System.out.println(p.brand);
        System.out.println(p.price);
        //使用成员方法
        p.call();
        p.sendMessage();
    }
}
