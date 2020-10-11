package com.StringTest;

/*
    append添加方法
    reverse反转方法
    链式编程
 */
public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        //append方法添加数据，并返回对象本身
        StringBuilder sb2 = sb.append("HelloWorld!");
        System.out.println("sb:"+sb);
        System.out.println("sb2:"+sb2);



        //链式编程
        StringBuilder sb3=new StringBuilder();
        sb3.append("Hello").append("World").append("Java").append(100);
        System.out.println("sb3:"+sb3);

        //反转，返回相反字符序列
        sb3.reverse();
        System.out.println("反转sb3:"+sb3);
    }
}
