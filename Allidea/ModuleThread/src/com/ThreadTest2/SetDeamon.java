package com.ThreadTest2;
/*
    设置守护线程，当运行的线程为守护线程时，JVM将很快退出
 */
public class SetDeamon {
    public static void main(String[] args) {

        Demo d2=new Demo();
        Demo d3=new Demo();


        d2.setName("二哥");
        d3.setName("三弟");
        //设置主线程为大哥
        Thread.currentThread().setName("大哥");

        //设置守护线程,当主线程执行完毕，守护线程没执行完也会随着JVM的退出而直接关闭
        d2.setDaemon(true);
        d3.setDaemon(true);


        d2.start();
        d3.start();

        //主线程执行
        for (int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
