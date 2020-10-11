package com.Sort;

import java.util.Arrays;

/*
    字符串中数据排序
 */
public class SortTest {
    public static void main(String[] args) {
        //定义一个字符串
        String s="91 27 46 38 50";
        //得到字符串中的每一个数据,存在字符数组中
        String[] arr1 = s.split(" ");

        //遍历该字符数组
       /* for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }*/

        //转存到int数组中
        int []arr2 =new int[arr1.length];
        for (int i=0;i<arr1.length;i++)
        {
            arr2[i]=Integer.parseInt(arr1[i]);
        }

        /*遍历该int数组
        for (int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }*/

        //对int数组进行排序
        /*for(int i=0;i<arr2.length-1;i++)
        {
            for (int j=0;j<arr2.length-1;j++)
            {
                if(arr2[j]>arr2[j+1])
                {
                    int temp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                }
            }
        }*/
        //简便排序
        Arrays.sort(arr2);

        /*遍历排序后的int数组
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }*/

        //用StringBuilder方法格式化数组
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr2.length;i++)
        {
            if(i==arr2.length-1)
            {
                sb.append(arr2[i]);
            }
            else
            {
                sb.append(arr2[i]+" ,");
            }
        }
        sb.append("]");
        String s2=sb.toString();
        System.out.println(s2);
    }
}
