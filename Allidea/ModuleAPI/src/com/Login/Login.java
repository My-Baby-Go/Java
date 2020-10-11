package com.Login;

import java.util.Scanner;
/*
    用equals方法比较字符串实现登录功能
 */
public class Login {
    public static void main(String[] args) {
        /*
            规定正确账号密码
         */
        String username="username";
        String password="123456";
        for(int i=0;i<3;i++)
        {
            //创建Scanner对象
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名");
            //获取输入的用户名
            String user = sc.nextLine();
            System.out.println("请输入密码");
            //获取输入的密码
            String pwd = sc.nextLine();
            //对输入的字符串和规定的字符串进行内容比较
            if(user.equals(username)&&pwd.equals(password))
            {
                System.out.println("登录成功");
                break;
            }
            else
            {
                if((2-i==0))
                {
                    System.out.println("登录失败，账号被锁定");
                    break;
                }
                System.out.println("登录失败，你还有"+(2-i) +"次机会");
            }
        }
    }
}
