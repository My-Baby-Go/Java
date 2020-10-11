package com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
    从键盘录入学生数据，然后遍历
 */
public class ALStudentTest2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<ALStudent2> arr=new ArrayList<ALStudent2>();
        //调用添加学生信息方法
        addStudent(arr);
        addStudent(arr);
        addStudent(arr);

        //遍历学生信息
        for(int i=0;i<arr.size();i++)
        {
            ALStudent2 s=arr.get(i);
            System.out.println("姓名："+s.getName()+" 年龄："+s.getAge());
        }

    }

    //创建添加学生信息的方法，提高代码的复用性和简洁性
    public static void addStudent(ArrayList<ALStudent2> stu)
    {
        //输入学生信息
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();

        //创建学生对象，把输入的学生信息赋值给学生对象的成员变量
        ALStudent2 s1=new ALStudent2();
        s1.setName(name);
        s1.setAge(age);

        stu.add(s1);
    }
}
