package com.School;

public class Student extends Person{
    public Student(){}
    public Student(String name,int age){
        super(name, age);
    }
    public void study(){
        System.out.println("学生的职责是学习");
    }

}
