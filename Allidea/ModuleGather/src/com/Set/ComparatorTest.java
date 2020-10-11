package com.Set;

import java.util.Comparator;
import java.util.TreeSet;

/*
比较器排序Comparator
 */
public class ComparatorTest {
    public static void main(String[] args) {
        //创建TreeSet集合对象，用匿名内部类重写Comparetor方法
        TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num=s1.getAge()-s2.getAge();
                int num2=num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });
        //创建学生对象
        Student s1=new Student("彭于晏",23);
        Student s2=new Student("胡歌",25);
        Student s3=new Student("古天乐",24);
        Student s4=new Student("张一山",23);
        //添加对象至集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        //遍历集合
        for(Student s:ts)
        {
            System.out.println(s.getName()+", "+s.getAge());
        }
    }
}
