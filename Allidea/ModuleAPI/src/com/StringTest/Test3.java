package com.StringTest;

import java.util.Scanner;

/*
    反向输出字符串
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String line = sc.nextLine();
        String s=reverse(line);
        System.out.println(s);
    }
    public static String reverse(String s)
    {
        String ss="";
        for(int i=s.length()-1;i>=0;i--)
        {
            ss+=s.charAt(i);
        }
        return ss;
    }
}
