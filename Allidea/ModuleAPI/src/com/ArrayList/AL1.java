package com.ArrayList;

import java.util.ArrayList;

/*
    ArrayList构造和添加
 */
public class AL1 {
    public static void main(String[] args) {
        //创建一个空的集合对象，JDK7以后右边尖括号里的String可省略
        ArrayList<String> arr=new ArrayList<>();
        //输出集合
        System.out.println("arr1:"+arr);
        //添加元素
        arr.add("Hello");
        arr.add("World");
        arr.add("Java");
        System.out.println("arr2:"+arr);
        //插入元素,注意不要越界
        arr.add(1,"Good");
        System.out.println("arr3:"+arr);
    }
}
