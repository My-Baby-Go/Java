package com.ThreadTest1;
/*
    创建MyThread对象
    启动多线程
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread mt1=new MyThread();
        MyThread mt2=new MyThread();

        /*//这样是不能启动多线程的，还是按顺序执行
        mt1.run();
        mt2.run();*/

        //setName给线程取名字
        mt1.setName("NO.1");
        mt2.setName("NO.2");
        //void start()，导致此线程开始执行; Java虚拟机调用此线程的run方法。
        mt1.start();
        mt2.start();

        /*static Thread currentThread()
        返回对当前正在执行的线程对象的引用。*/
        System.out.println(Thread.currentThread().getName());

    }
}
