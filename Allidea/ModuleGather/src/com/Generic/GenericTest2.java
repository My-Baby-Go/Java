package com.Generic;
/*
    泛型方法的使用
 */
public class GenericTest2 {
    public static void main(String[] args) {
        Generic g=new Generic();
        //可在调用方法时根据数据自动识别数据类型，不用跟泛型类一样多次创建对象
        g.show("彭于晏");
        g.show(23);
        g.show(185.5);
    }


}
