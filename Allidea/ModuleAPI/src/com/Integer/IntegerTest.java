package com.Integer;
/*
    Integer类的使用
    valueOf(int i),返回表示指定的int值的Integer实例
    valueOf(String s),返回一个保存指定值的Integer对象String
 */
public class IntegerTest {
    public static void main(String[] args) {
        /*  过时方法
        Integer i1=new Integer(100);
        System.out.println(i1);
        Integer i2=new Integer("100");
        System.out.println(i2);
         */
        //创建Integer对象

        //常用方法  注意没有new
        Integer i1=Integer.valueOf(100);
        System.out.println(i1);

        //只能是数字组成的字符串
        Integer i2=Integer.valueOf("100");

//        Integer i2=Integer.valueOf("sss");//报错NumberFormatException
        System.out.println(i2);
    }
}
