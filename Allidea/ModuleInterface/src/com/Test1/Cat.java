package com.Test1;

/*
    新建一个类实现接口 implements
    同样遵循抽象的规则
    必须重写接口里的抽象方法或者本身就是抽象类
 */
public class Cat implements Play{
    @Override
    public void play() {
        System.out.println("猫爱玩球");
    }
}
