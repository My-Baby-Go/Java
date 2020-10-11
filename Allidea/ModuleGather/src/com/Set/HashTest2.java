package com.Set;

import java.util.HashSet;
/*
    HashSet遍历对象
    要求：变量相同的对象认为是同一对象，不重复储存
    如何达成：重写hashCode方法和equals方法，自动生成
 */
public class HashTest2 {
    public static void main(String[] args) {
        //创建HashSet对象
        HashSet<Student> hs=new HashSet<Student>();

        //创建学生对象
        Student s1=new Student("彭于晏",23);
        Student s2=new Student("胡歌",24);
        Student s3=new Student("彭于晏",23);

        //添加对象至集合
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        //遍历集合
        for(Student s:hs)
        {
            System.out.println(s.getName()+" ,"+s.getAge());
        }
    }
}
