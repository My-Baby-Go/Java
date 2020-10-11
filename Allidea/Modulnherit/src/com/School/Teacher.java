package com.School;

public class Teacher extends Person{
    public Teacher(){}
    public Teacher(String name,int age){
        super(name,age);
    }
    public void teach(){
        System.out.println("老师的职责是教书");
    }
}
