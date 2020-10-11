package com.StringTest;

import java.util.Scanner;

/*
    用CharAt方法遍历键盘输入的字符串
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String line = sc.nextLine();
        for(int i=0;i<line.length();i++)
        {
            System.out.println(line.charAt(i));
        }
    }
}
