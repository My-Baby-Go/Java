package com.ThreadTest1;
/*
    控制线程的优先级
    优先级：[1,10] 逐步变高,默认为5
    setPriority() 设置优先级
    getPriority() 获取优先级
    优先级高意味着获取CPU时间片几率大，不是完全优先
 */
public class TheadPriorityTest {
    public static void main(String[] args) {
        //创建MyThread对象
        MyThread mt1=new MyThread();
        MyThread mt2=new MyThread();
        MyThread mt3=new MyThread();
        //给各线程取名
        mt1.setName("大哥");
        mt2.setName("二哥");
        mt3.setName("三弟");
        //设置线程优先级
        mt1.setPriority(10);
        mt2.setPriority(5);
        mt3.setPriority(1);
        //启动各线程
        mt1.start();
        mt2.start();
        mt3.start();
        //获取各线程优先级
        System.out.println("大哥优先级："+mt1.getPriority()+"\r\n"+"二哥优先级："+mt2.getPriority()+"\r\n"+"三弟优先级："+mt3.getPriority());
    }
}
