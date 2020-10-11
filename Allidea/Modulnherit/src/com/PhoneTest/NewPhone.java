package com.PhoneTest;
/*
    新手机：子类
 */
public class NewPhone extends Phone{
    //重写call方法
    //@Override注解，可以检查重写方法的方法声明是否正确
    @Override

    public void call(){
        super.call();
        System.out.println("现在的手机还可以视频");
    }

}
