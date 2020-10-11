package com.Customize;

import java.util.Scanner;

public class AgeTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年龄");
        int age=sc.nextInt();
        Age a=new Age();

        try {
            a.checkAge(age);
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }
}
