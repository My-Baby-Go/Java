package com.Exchange;
/*
    int和String相互转换

 */
public class Exchange {
    public static void main(String[] args) {
        //int--String,String类的valueOf方法
        int i=100;
        String s=String.valueOf(i);
        System.out.println(s);

        //String--int
        String s2="1000";
        //方法1,String--Integer--int，通过Integer中转
        Integer i1=Integer.valueOf(s2);
        int i2=i1.intValue();
        System.out.println(i1);

        //方法2，String--int
        int i3=Integer.parseInt(s2);
        System.out.println(i3);

    }
}
