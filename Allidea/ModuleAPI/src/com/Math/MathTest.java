package com.Math;
/*
    API之Math常用方法
 */
public class MathTest {
    public static void main(String[] args) {
        //绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("--------");

        //向上取整
        System.out.println(Math.ceil(87.1546));
        System.out.println("--------");
        //向下取整
        System.out.println(Math.floor(88.124));
        System.out.println("--------");
        //四舍五入
        System.out.println(Math.round(87.685));
        System.out.println("--------");
        //最大值
        System.out.println(Math.max(88,100));
        System.out.println("--------");
        //最小值
        System.out.println(Math.min(1,88));
        System.out.println("--------");
        //a的b次幂的值
        System.out.println(Math.pow(2.0,3.0));
        System.out.println("--------");
        //[0,1.0)的随机double类型数
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));//用强制转换和*100倍，随机返回0-99的数
    }
}
