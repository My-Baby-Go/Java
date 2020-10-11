package com.File;

import java.io.File;
import java.io.IOException;

/*
    File类的创建功能
    创建的是目录还是文件是根据调用方法确定的，而不是名字
 */
public class FileTest2 {
    public static void main(String[] args) throws IOException {
        //创建文件  createNewFile
        File f1=new File("E:\\FileTest\\java.txt");
        //创建成功返回true，否则false
        System.out.println(f1.createNewFile());

        //创建单级目录   mkdir
        File f2=new File("E:\\FileTest\\java");
        System.out.println(f2.mkdir());

        //创建多级目录  mkdirs
        File f3=new File("E:\\FileTest\\1\\2");
        System.out.println(f3.mkdirs());

    }
}
