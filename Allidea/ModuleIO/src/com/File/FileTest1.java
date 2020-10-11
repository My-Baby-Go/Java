package com.File;

import java.io.File;

/*
    File类的三个构造方法
    给的路径只是抽象表示，不一定真实存在
 */
public class FileTest1 {
    public static void main(String[] args) {
        //1.简单直接
        File f1=new File("E:\\迅雷下载\\下载b站视频\\1.mp4");
        //输出结果为路劲内容，说明重写了toString方法
        System.out.println(f1);
        //2.分层
        File f2=new File("E:\\迅雷下载","下载b站视频\\2.mp4");
        System.out.println(f2);
        //3.路径名+字符串
        File f3=new File("E:\\迅雷下载");
        File f4=new File(f3,"下载b站视频\\3.mp4");
        System.out.println(f4);
    }
}
