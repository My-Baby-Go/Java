package com.Generic;
/*
    可变参数的使用
 */
public class ArgsTest {
    public static void main(String[] args) {
        int s1 = sum(10, 20, 30, 40);
        System.out.println(s1);
        int s2 = sum(10, 20);
        System.out.println(s2);
        int s3 = sum(10, 20, 30);
        System.out.println(s3);
    }
    public static int sum(int... a){
        int sum=0;
        for (int i:a){
            sum+=i;
        }
        return sum;
    }
    /*
        若需要多个参数，要把可变参数放在后边
    public static int sum2(int b,int...a)
    {

    }
    */

}
