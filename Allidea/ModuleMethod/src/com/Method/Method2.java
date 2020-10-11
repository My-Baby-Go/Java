package com.Method;

public class Method2 {
    public static void main(String[] args) {
        //方法重载
        int sum1=sum(10,20);
        System.out.println(sum1);
        double sum2=sum(9.5,10.5);
        System.out.println(sum2);
        int sum3=sum(10,20,30);
        System.out.println(sum3);
    }
    public static int sum(int a,int b)
    {
        int sum;
        sum=a+b;
        return sum;
    }
    public static double sum(double a,double b)
    {
        double sum;
        sum=a+b;
        return  sum;
    }
    public static int sum(int a,int b,int c)
    {
        int sum;
        sum=a+b+c;
        return sum;
    }
}
