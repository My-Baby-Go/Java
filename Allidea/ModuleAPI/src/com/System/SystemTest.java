package com.System;
/*
    API之System的常用方法
 */
public class SystemTest {
    public static void main(String[] args) {
        /*
        System.out.println("开始");
        //终止当前运行的JVM虚拟机,非0表示异常终止
        System.exit(0);
        System.out.println("结束");
        */

        //返回当前时间与1970年1月1日相差的毫秒值,单位是毫秒
        System.out.println(System.currentTimeMillis());
        //以年为单位
        System.out.println((System.currentTimeMillis()*1.0)/1000/60/60/42/365+"年");

        //计算某段程序运行时间
        long start=System.currentTimeMillis();
        for (int i=0;i<1000;i++)
        {
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("该循环用时"+(end-start)+"毫秒");
    }
}
