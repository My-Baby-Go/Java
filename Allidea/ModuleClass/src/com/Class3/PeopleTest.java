package com.Class3;

public class PeopleTest {
    public static void main(String[] args) {
        //在创建对象时new People()会自动调用构造方法
        People p=new People();
        p.name="彭于晏";
        //set方法给age赋值
        p.setAge(30);
        p.show();
    }


}
