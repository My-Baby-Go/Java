package com.Customize;
/*
    自定义异常类
    首先继承Exception类
    创建无参和带参构造方法
 */
public class AgeException extends Exception{
    public AgeException(){};
    public AgeException(String message){
        super(message);
    };
}
