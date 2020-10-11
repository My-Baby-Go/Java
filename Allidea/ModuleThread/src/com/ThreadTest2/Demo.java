package com.ThreadTest2;
/*
    用来测试线程控制
 */
public class Demo extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=99;i++)
        {
            System.out.println(getName()+i);
            /*//让正执行的线程停留指定毫秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
