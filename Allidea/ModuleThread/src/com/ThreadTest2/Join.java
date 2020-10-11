package com.ThreadTest2;
/*
    void join()
    等待线程死亡
    该线程执行完毕才执行其他线程
 */
public class Join {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();

        d1.setName("大哥");
        d2.setName("二哥");
        d3.setName("三弟");

        d1.start();
        try {
            //等待线程死亡
            d1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        d2.start();
        d3.start();
    }
}
