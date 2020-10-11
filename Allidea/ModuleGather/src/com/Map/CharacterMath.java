package com.Map;

import java.util.*;

/*
    统计字符串中各字符个数
 */
public class CharacterMath {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String s=sc.nextLine();

        //创建HashMap集合（无序），键是Character，值是Integer
            HashMap<Character,Integer> hm=new HashMap<>();

        /*//改成TreeMap，使结果有序
        TreeMap<Character,Integer> hm=new TreeMap<>();*/

        //遍历字符串，得到每一个字符
        for (int i=0;i<s.length();i++)
        {
            char key=s.charAt(i);
            //拿到的每一个字符作为键去HashMap里去找值，看其返回值
            Integer value=hm.get(key);
            if(value==null){
                //返回为空，说明该字符第一次出现，则把该字符作为键，1为值
                hm.put(key,1);
            }else {
                //返回不为空，则值+1
                value++;
                hm.put(key,value);
            }
        }

        //遍历集合，得到键和值，按要求拼接
        StringBuilder sb=new StringBuilder();

        Set<Character> keySet=hm.keySet();
        for (Character key:keySet){
            Integer value=hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String result=sb.toString();

        System.out.println(result);

    }
}
