package com.Generic;
/*
泛型接口的使用
 */
public class GenericTest3 {
    public static void main(String[] args) {
        GenericInterface g=new GenericImpl();
        g.show("彭于晏");
        g.show(35);
        g.show(188.5);
    }
}
