package com.School;

public class Test {
    public static void main(String[] args) {
        //无参构造方法
        //创建老师对象
        Teacher t1=new Teacher();
        t1.setName("彭于晏");
        t1.setAge(30);
        System.out.println(t1.getName()+" ,"+t1.getAge());
        t1.teach();

        //有参构造方法
        //创建老师对象
        Teacher t2=new Teacher("胡歌",30);
        System.out.println(t2.getName()+" ,"+t2.getAge());
        t2.teach();

        //无参构造方法
        //创建学生对象
        Student s1=new Student();
        s1.setName("张一山");
        s1.setAge(20);
        System.out.println(s1.getName()+" ,"+s1.getAge());
        s1.study();

        //有参构造方法
        //创建学生对象
        Student s2=new Student("易烊千玺",20);
        System.out.println(s2.getName()+" ,"+s2.getAge());
        s2.study();
    }
}
