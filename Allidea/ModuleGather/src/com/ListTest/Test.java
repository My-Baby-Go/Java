package com.ListTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //创建集合对象
        Collection<Student> c=new ArrayList<Student>();
        //创建学生对象
        Student s1=new Student("彭于晏",30);
        Student s2=new Student("胡歌",32);

        //把学生对象添加到集合中
        c.add(s1);
        c.add(s2);

        //遍历集合(迭代器方式)
        Iterator<Student> it = c.iterator();
        while (it.hasNext())
        {
            Student s = it.next();
            System.out.println(s.getName()+" ,"+s.getAge());
        }
    }


}
