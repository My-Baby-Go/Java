package com.Generic;
/*
    泛型接口的实现类
 */
public class GenericImpl<T> implements GenericInterface<T>{
    @Override
    public <T> void show(T t) {
        System.out.println(t);
    }
}
