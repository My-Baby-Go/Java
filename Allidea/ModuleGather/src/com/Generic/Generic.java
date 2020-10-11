package com.Generic;
/*
    1.泛型类
    2.泛型方法
    可以在使用时任意指定类型
 */
/*//1.泛型类
public class Generic <T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
        }
    }*/

//2.泛型方法
public class Generic<T>{
    public <T> void show(T t){
        System.out.println(t);
    }
}



