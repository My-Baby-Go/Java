package com.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    创建Collection集合的对象
    用多态的方式
    ArrayList();
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> s=new ArrayList<String>();

        //添加元素s
        s.add("hello");
        s.add("world");
        s.add("Java");

        //输出集合对象
        System.out.println(s);
    }
}
