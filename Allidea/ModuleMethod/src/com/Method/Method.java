package com.Method;

public class Method {
    public static void main(String[] args) {
        //调用方法
        System.out.println("第一个方法实例");
        whatNumber();
        System.out.println("第二个方法实例");
        whoBig();
        System.out.println("带参数方法的实现");
        getMax(10,20);
        System.out.println("带返回值的方法实现");
        boolean flag=isEvenNumber(21);
        System.out.println(flag);
    }
    //定义方法
    public static void whatNumber(){
        int num=99;
        if(num%2==0)
        {
            System.out.println(num+"是偶数");
        }
        else
        {
            System.out.println(num+"是奇数");
        }
    }
    public static void whoBig(){
        int num1=10;
        int num2=20;
        if(num1>num2)
        {
            System.out.println(num1);
        }
        else if(num1==num2)
        {
            System.out.println("一样大");
        }
        else
        {
            System.out.println(num2);
        }
    }
    public static void getMax(int num1,int num2){
        if(num1>num2)
        {
            System.out.println(num1);
        }
        else if(num1==num2)
        {
            System.out.println("一样大");
        }
        else
        {
            System.out.println(num2);
        }
    }
    public static boolean isEvenNumber(int num){
        if(num%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
