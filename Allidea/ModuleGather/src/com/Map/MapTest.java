package com.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Mao集合的基本功能
 */
public class MapTest {
    public static void main(String[] args) {
        //创建Map对象
        Map<String,String> m=new HashMap<>();

        //添加键值对,键不可以重复，若重复，则覆盖
        m.put("001","彭于晏");
        m.put("002","胡歌");
        m.put("003","古天乐");

/*
        //根据键删除键值对并返回值
        m.remove("001");
*/

/*
        //移除所有键值对
        m.clear();
*/

/*
        //判断是否包含指定的键
        System.out.println(m.containsKey("001"));
        System.out.println(m.containsKey("004"));
*/
/*

        //判断集合是否为空
        System.out.println(m.isEmpty());
*/

/*
        //集合的长度，即键值对个数
        System.out.println(m.size());
*/

/*        //根据键获取值
        System.out.println(m.get("001"));*/

        /*//获取键的集合
        Set<String> s = m.keySet();
        for (String key:s){
            System.out.println(key);
        }*/

        /*//获取值的集合
        Collection<String> v = m.values();
        for (String value:v){
            System.out.println(value);
        }*/


        System.out.println(m);

    }
}
