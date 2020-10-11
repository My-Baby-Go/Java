package com.ListTest2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //创建集合对象
        List<Student> list=new ArrayList<Student>();
        //创建学生类对象
        Student stu1=new Student("彭于晏","男",23);
        Student stu2=new Student("胡歌","男",24);
        Student stu3=new Student("古天乐","男",25);

        //将学生对象放进集合
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //迭代器遍历
        Iterator<Student> it=list.iterator();
        while (it.hasNext())
        {
            Student s = it.next();
            System.out.println(s.getName()+" ,"+s.getSex()+" ,"+s.getAge());
        }
        System.out.println("--------");

        //普通for循环,带有索引的遍历方式
        for(int i=0;i<list.size();i++)
        {
            Student s = list.get(i);
            System.out.println(s.getName()+" ,"+s.getSex()+" ,"+s.getAge());
        }
        System.out.println("--------");

        //增强for循环，最方便的遍历方式
        for(Student s:list)
        {
            System.out.println(s.getName()+" ,"+s.getSex()+" ,"+s.getAge());
        }
    }



}
