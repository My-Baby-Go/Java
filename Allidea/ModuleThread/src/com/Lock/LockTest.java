package com.Lock;

public class LockTest {
    public static void main(String[] args) {
        //创建卖票类对象
        Demo st=new Demo();

        //设置多个窗口
        //创建三个Thread类的对象，把SellTicketDemo对象作为构造方法的参数
        Thread s1=new Thread(st,"一号窗口");
        Thread s2=new Thread(st,"二号窗口");
        Thread s3=new Thread(st,"三号窗口");

        //启动线程
        s1.start();
        s2.start();
        s3.start();
    }
}
