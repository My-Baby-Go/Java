package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    遍历学生
 */
public class MapStudent {
    public static void main(String[] args) {
        Map<String,Student> map=new HashMap<>();

        Student s1=new Student("彭于晏",30);
        Student s2=new Student("林俊杰",32);
        Student s3=new Student("胡歌",33);

        map.put("001",s1);
        map.put("002",s2);
        map.put("003",s3);

        //遍历方式一:键找值
        Set<String> keySet=map.keySet();
        for (String key:keySet)
        {
            Student value=map.get(key);
            System.out.println(key+","+value.getName()+","+value.getAge());
        }
        System.out.println("--------");
        //遍历方式二：键值对象找键和值
        Set<Map.Entry<String,Student>> entrySet=map.entrySet();
        for (Map.Entry<String,Student> me:entrySet)
        {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+","+value.getName()+","+value.getAge());
        }
    }
}
