package com.Bubble;
/*
    用循环完成冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
         int[] arr={10,30,50,20,40};
        System.out.println("排序前:"+arrayToString(arr));

        //排序过程
         for(int i=0;i<arr.length-1;i++)
         {
             for(int j=0;j<arr.length-1;j++)
             {
                 if(arr[j]>arr[j+1])
                 {
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                 }
             }
         }
        System.out.println("排序后"+arrayToString(arr));

    }

    //按格式输出数组
    public static String arrayToString(int[] arr)
    {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-1)
            {
                sb.append(arr[i]);
            }
            else
            {
                sb.append(arr[i]+" ,");
            }
        }
        sb.append("]");
        String s=sb.toString();
        return  s;
    }
}
