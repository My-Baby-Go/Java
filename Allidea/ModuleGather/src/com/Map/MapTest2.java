package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的遍历方式1
 */
public class MapTest2 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> m=new HashMap<>();
        //添加集合元素
        m.put("001","林俊杰");
        m.put("002","彭于晏");
        m.put("003","胡歌");
        //获取所有键的集合，用keyset实现
        Set<String> key=m.keySet();
        //遍历键的集合，获取每一个键
        for (String k:key)
        {
            //根据键找值，用get(Object key)方法实现
            String value=m.get(k);
            System.out.println(k+","+value);
        }

    }
}
