package com.Class4;

public class Complete {
    private String name;
    private int age;

    /*
        成员方法
     */
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    /*
        构造方法
     */
    public Complete(){}
    public Complete(String name,int age)
    {
        this.age=age;
        this.name=name;
    }

    /*
        show方法
     */
    public void show(){
        System.out.println("名字是"+name+", 年龄是"+age);
    }

}
