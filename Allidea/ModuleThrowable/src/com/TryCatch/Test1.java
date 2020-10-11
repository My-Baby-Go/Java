package com.TryCatch;
/*
    异常处理
    try{
        可能出现异常的代码;
       }
       catch(异常类名 变量名)
       {
            异常处理代码;
       }
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");

    }
    public static void method()
    {
        //捕获异常
        try {
            int [] arr={1,2,3};
            System.out.println(arr[3]);//异常ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();//将异常信息输出到控制台
        }

    }
}
