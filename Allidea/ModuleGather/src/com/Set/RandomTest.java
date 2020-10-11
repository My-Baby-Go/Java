package com.Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
/*
生成10个20以内的随机数，存入集合并遍历
 */
public class RandomTest {
    public static void main(String[] args) {
        //无序
        //Set<Integer> set=new HashSet<Integer>();
        //排序
        TreeSet<Integer> set=new TreeSet<Integer>();

        Random r=new Random();

        while (set.size()<10)
        {
            int num=r.nextInt(20)+1;
            set.add(num);
        }

        for (Integer i:set)
        {
            System.out.println(i);
        }

    }
}
