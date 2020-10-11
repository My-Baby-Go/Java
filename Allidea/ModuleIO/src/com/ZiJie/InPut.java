package com.ZiJie;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流读数据
    一次读取一个字节数据
 */
public class InPut {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis=new FileInputStream("E:\\FileTest\\java.txt");
        //调用读数据方法
       /* int r = fis.read();
        System.out.println(r);
        System.out.println((char) r);*/

        //为了连续调用使用循环
        int r;
        while ((r=fis.read())!=-1){
            System.out.print((char) r);
        }
    }
}
