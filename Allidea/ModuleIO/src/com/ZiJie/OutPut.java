package com.ZiJie;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
    字节流写入数据
    与IO相关的操作要记得释放资源
 */
public class OutPut {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream fos=new FileOutputStream("E:\\FileTest\\java.txt");

        fos.write(97);//ASCII码，97=a

        //记得释放资源
        fos.close();
    }
}
