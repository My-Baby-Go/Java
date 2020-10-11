package com.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int []arr={30,40,50,20,10};
        //返回指定数组的内容的字符串表示形式
        System.out.println("排序前"+ java.util.Arrays.toString(arr));

        //按数字顺序排列指定的数组
        java.util.Arrays.sort(arr);

        //返回指定数组的内容的字符串表示形式
        System.out.println("排序后"+ java.util.Arrays.toString(arr));
    }
}
