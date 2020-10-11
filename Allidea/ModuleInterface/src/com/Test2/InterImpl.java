package com.Test2;

public class InterImpl implements Inter{
    //实现类必须重写接口的方法
    @Override
    public void method() {
        System.out.println("重写接口的方法");
    }

    //实现类中的构造方法调的不是接口的构造方法，因为接口没有构造方法
    //它调用的是超类Object的构造方法
    public InterImpl(){
        super();
    }
}
