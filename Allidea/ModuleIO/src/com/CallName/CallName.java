package com.CallName;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

/*
    点名器
    1.创建字符缓冲输入流对象
    2.创建ArrayList集合对象
    3.调用字符缓冲输入流对象的方法读数据
    4.把读取到的字符串数据存储到集合中
    5.释放资源
    6.使用Random产生一个随机数，范围为[0，集合长度)
    7.把随机数作为索引到ArrayList集合中获取值
    8.把数据输出到控制台
 */
public class CallName {
    public static void main(String[] args) throws IOException {
        //创建名单文本
      /*  File f=new File("ModuleIO\\name.txt");
        f.createNewFile();*/

        //创建字符缓冲输入流对象
        BufferedReader br=new BufferedReader(new FileReader("ModuleIO\\\\name.txt"));

        //创建集合对象
        ArrayList<String> array=new ArrayList<>();

        //调用字符缓冲输入流对象的方法读数据
        String line;
        while ((line=br.readLine())!=null){
            //把读取到的字符串数据存储到集合中
            array.add(line);
        }
        //释放资源
        br.close();

        //使用Random产生随机数
        Random rd=new Random();
        int i = rd.nextInt(array.size());

        //把随机数作为索引去集合中取值
        String name = array.get(i);

        //把数据输出到控制台
        System.out.println("幸运者是："+name);
    }
}
