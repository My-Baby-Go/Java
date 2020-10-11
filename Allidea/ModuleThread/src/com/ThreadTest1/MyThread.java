package com.ThreadTest1;
/*
    实现多线程
    MyThread类继承Thread，重写Run方法

    getName返回线程名称,默认Thread-0,1,2..
    用setName给线程取名字
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
