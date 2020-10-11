package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest3 {
    public static void main(String[] args) {
        Map<String,String> m=new HashMap<>();

        m.put("001","林俊杰");
        m.put("002","彭于晏");
        m.put("003","胡歌");

        //获取所有键值对对象的集合
        Set<Map.Entry<String,String>> entrySet=m.entrySet();
        //遍历键值对对象集合，获取每一个键值对对象
        for (Map.Entry<String,String> me:entrySet)
        {
            String key=me.getKey();
            String value=me.getValue();
            System.out.println(key+","+value);
        }
    }
}
