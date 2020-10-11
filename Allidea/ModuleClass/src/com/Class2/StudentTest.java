package com.Class2;

public class StudentTest {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.name="张三";
        stu.sex='男';
        stu.age=18;
        System.out.println(stu.name);
        System.out.println(stu.sex);
        System.out.println(stu.age);
        stu.Study();
        //多个对象指向同一内存图
        Student stu2=stu;
        stu2.name="李四";
        stu2.sex='女';
        stu2.age=17;
        System.out.println(stu.name+" "+stu.sex+" "+stu.age);
        System.out.println(stu2.name+" "+stu2.sex+" "+stu2.age);
   }
}
