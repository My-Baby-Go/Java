package com.Test1;

/*
    接口也是抽象的，所以也不能直接创建接口的对象
    采用多态的方式通过实现类对对象实例化，这叫接口多态。
 */
public class PlayTest {
    public static void main(String[] args) {
        Play p=new Cat();
        p.play();
    }
}
