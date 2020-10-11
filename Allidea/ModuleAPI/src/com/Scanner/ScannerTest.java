package com.Scanner;
import java.util.Scanner;
/*
    Scanner用于获取键盘输入数据（基本数据类型，字符串类型）

    public String nextLine();
    用于获取字符串数据
 */
public class ScannerTest {
    public static void main(String[] args) {
        //创建对象
        Scanner sc=new Scanner(System.in);
        //接收数据
        System.out.println("请输入字符串数据");
        //sc.nextLine 按下Ctrl+Alt+V,自动生成左边部分
        String line = sc.nextLine();
//        String line=sc.nextLine();
        System.out.println("你输入的数据是："+line);
    }
}
