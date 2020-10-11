package com.ThreadTest2;
/*
    让正在执行的线程停留指定的毫秒数
    在Demo类里使用sleep方法完成
 */
public class Sleep {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();

        d1.setName("大哥");
        d2.setName("二哥");
        d3.setName("三弟");

        d1.start();
        d2.start();
        d3.start();

    }
}
