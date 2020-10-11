package com.File;

import java.io.File;
/*
    用递归的方法遍历输出目录下的文件的绝对路径
 */
public class FileDigui {
    public static void main(String[] args) {
        //根据路径创建一个File对象
        File f1=new File("E:\\FileTest");

        //调用方法
        getAllFile(f1);
    }

    //创建获取目录下内容的方法，参数为主方法里的File对象
    public static void getAllFile(File src){
        //获取给定目录下的文件或目录的File数组
        File[] filesArray=src.listFiles();
        //遍历该File数组，得到每一个File对象
        if(filesArray!=null){
            for (File file:filesArray){
                //判断该对象是不是目录
                if (file.isDirectory()){
                    //是则继续递归调用
                    getAllFile(file);
                }else {
                    //不是则返回绝对路径
                    System.out.println(file.getAbsoluteFile());
                }
            }
        }
    }
}
