package com.ArrayList;

import javax.swing.*;
import java.util.ArrayList;

/*
    ArrayList常用方法
    arr.remove(Object o)删除指定元素，返回bool值，是否成功
    arr.remove(int)删除指定索引处元素，返回被删除元素
    arr.set(int,element)修改指定索引处元素，返回被修改元素
    arr.get(int)返回指定索引处元素
    arr.size();返回集合中元素个数
 */
public class AL2 {
    public static void main(String[] args) {
        //创建空集合
        ArrayList<String> arr=new ArrayList<>();
        //添加元素
        arr.add("Hello");
        arr.add("World");
        arr.add("Java");

        //删除指定元素,返回是否成功删除
        /*System.out.println(arr.remove("Java"));
        System.out.println(arr);*/

        //删除指定索引处元素，并返回被删除元素
       /* System.out.println(arr.remove(2));
        System.out.println(arr);*/

        //修改指定索引处元素，并返回被修改元素
      /*  System.out.println(arr.set(2,"Spring"));
        System.out.println(arr);*/

        //返回指定索引处元素
       /* System.out.println(arr.get(2));
        System.out.println(arr);*/

        //返回元素个数
        /*System.out.println(arr.size());
        System.out.println(arr);*/
    }
}
