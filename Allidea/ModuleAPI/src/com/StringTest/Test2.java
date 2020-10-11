package com.StringTest;

import java.util.Scanner;
/*
    统计字符串中各种字符的个数
 */
public class Test2 {
    public static void main(String[] args) {
        int Big=0;
        int Small=0;
        int Math=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String line = sc.nextLine();
        for(int i=0;i<line.length();i++)
        {
            if(line.charAt(i)>='A'&&line.charAt(i)<='Z')
            {
                Big++;
            }
            else if (line.charAt(i)>='a'&&line.charAt(i)<='z')
            {
                Small++;
            }
            else if (line.charAt(i)>='0'&&line.charAt(i)<='9')
            {
                Math++;
            }
        }
        System.out.println("大写字母的个数是:"+Big);
        System.out.println("小写字母的个数是:"+Small);
        System.out.println("数字的个数是:"+Math);
    }
}
