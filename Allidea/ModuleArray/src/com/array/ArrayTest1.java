package com.array;

public class ArrayTest1 {
    public static void main(String[] args) {
        int []arr1=new int[3];
        /*
            左边：说明数组类型，数组名
            右边：new为数组申请内存空间，说明数组长度
         */
        System.out.println("动态初始化数组");
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        arr1[1]=100;
        arr1[2]=200;
        System.out.println("修改数组中的元素值");
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        /*
            静态初始化数组
         */
        int []arr2={1,2,3};
        System.out.println("静态初始化数组");
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        /*
            遍历数组arr2
            数组名.length  （得到数组长度）
            通过for循环
         */
        System.out.println("遍历数组arr2");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }

        /*
            输出数组arr2中的最大值
         */
        int max=arr2[0];
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]>max)
            {
                max=arr2[i];
            }
        }
        System.out.println("数组最大值为："+max);
    }
}
