package com.ThreadTest3;

public class RunnableTest {
    public static void main(String[] args) {
//        创建对象
        RunnableDemo rd=new RunnableDemo();

        //创建Thread类的对象，把RunnableDemo对象作为构造方法的参数
        Thread t1=new Thread(rd,"老大");
        Thread t2=new Thread(rd,"老二");

        t1.start();
        t2.start();
    }
}
