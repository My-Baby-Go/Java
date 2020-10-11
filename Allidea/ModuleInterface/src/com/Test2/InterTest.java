package com.Test2;
/*
    测试类
 */
public class InterTest {
    public static void main(String[] args) {
        //用多态的方式创建接口对象
        Inter i=new InterImpl();
        i.method();
    }
}
