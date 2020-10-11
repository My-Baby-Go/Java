package com.Debug;

public class Debug3 {
    public static void main(String[] args) {
       int max=getMax(10,20);
        System.out.println("最大值是："+max);
    }
    public static int getMax(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
}
