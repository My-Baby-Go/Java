package com.Test1;

/*
    抽象类不可以直接创捷对象
    可以参考多态的方式，通过子类对象实例化，这叫抽象类多态
 */
public class Test {
    public static void main(String[] args) {
    /*
        因为是抽象类，所以不可以创建对象
        Animal a=new Animal();  //错误
    */

        //正确操作：
        Animal a=new Cat();
        a.eat();
    }

}
