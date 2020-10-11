package com.StudentMange;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMange {

    //系统主界面
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> arr=new ArrayList<Student>();
        while (true)
        {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出系统");
            System.out.println("请输入您的选择：");
            Scanner sc=new Scanner(System.in);
            String line=sc.nextLine();
            switch (line){
                case "1":
//                    System.out.println("添加学生");
                    addStudent(arr);
                    break;
                case "2":
//                    System.out.println("删除学生");
                    deleteStudent(arr);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(arr);
                    break;
                case "4":
//                    System.out.println("查看学生");
                    findAllStudent(arr);
                    break;
                case "5":
                    System.out.println("感谢使用");
                    //jvm退出
                    System.exit(0);

            }
        }

    }

    //添加学生信息方法
    public static void addStudent(ArrayList<Student> arr)
    {

        //录入学生信息，根据提示输入
        Scanner sc=new Scanner(System.in);
        String id;
        while (true)
        {
            System.out.println("请输入学号");
            id=sc.nextLine();
            //判断学号是否存在
            boolean flag=isID(arr,id);
            if(flag)
            {
                System.out.println("学号已存在，请重新输入");
            }
            else
            {
                break;
            }
        }

        System.out.println("请输入姓名");
        String name=sc.nextLine();
        System.out.println("请输入性别");
        String sex=sc.nextLine();
        System.out.println("请输入年龄");
        String age=sc.nextLine();

        //创建学生对象，把输入的信息赋值给学生对象的成员变量
        Student stu=new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setSex(sex);
        stu.setAge(age);
        //将学生对象添加到集合中
        arr.add(stu);
        //给出添加成功提示
        System.out.println("添加学生成功");
    }

    //查看学生信息方法
    public static void findAllStudent(ArrayList<Student> arr)
    {
        if(arr.size()==0)
        {
            System.out.println("表中信息为空，请添加信息后查看");
            return;
        }
        //显示表头信息
        // \t就是tab键，控制格式
        System.out.println("学号\t姓名\t性别\t年龄");
        //将集合中的数据按格式显示
        for(int i=0;i<arr.size();i++)
        {
            Student s=arr.get(i);
            System.out.println(s.getId()+"\t\t"+s.getName()+"\t"+s.getSex()+"\t\t"+s.getAge()+"岁");
        }
    }

    //删除学生方法
    public static void deleteStudent(ArrayList<Student> arr)
    {
        int index=-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除的学生信息的学号");
        String id=sc.nextLine();
        for(int i=0;i<arr.size();i++)
        {
            Student s=arr.get(i);
            if(s.getId().equals(id))
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            System.out.println("您输入的学号不存在,请重新选择");
        }
        else
        {
            arr.remove(index);
            System.out.println("删除学生成功");
        }
    }

    //修改学生方法
    public static void updateStudent(ArrayList<Student> arr)
    {
        int index=-1;
        System.out.println("请输入要修改的学生学号");
        Scanner sc=new Scanner(System.in);
        String id=sc.nextLine();

        //判断是否有此学号
        for(int i=0;i<arr.size();i++)
        {
            Student s=arr.get(i);
            if(s.getId().equals(id))
            {
                index=i;
                break;
            }
        }
        if(index==-1)
        {
            System.out.println("您输入的学号不存在,请重新输入");
        }
        else
        {
            //开始修改学生信息
            System.out.println("请输入学生姓名");
            String name=sc.nextLine();
            System.out.println("请输入学生性别");
            String sex=sc.nextLine();
            System.out.println("请输入学生年龄");
            String age=sc.nextLine();

            //创建学生对象
            Student s=new Student();
            s.setId(id);
            s.setName(name);
            s.setSex(sex);
            s.setAge(age);

            //在集合中修改学生信息
            arr.set(index,s);
        }
    }

    //判断学号是否重复方法
    public static boolean isID(ArrayList<Student> arr,String id){
        boolean flag=false;
        for(int i=0;i<arr.size();i++)
        {
            Student s=arr.get(i);
            if(s.getId().equals(id))
            {
                flag=true;
            }
        }
        return flag;
    }
}
