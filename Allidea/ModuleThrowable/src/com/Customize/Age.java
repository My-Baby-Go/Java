package com.Customize;

public class Age {
    public void checkAge(int age) throws AgeException {
        //判断年龄是否正常（是否满足异常）
        if(age<0||age>150)
        {
            throw new AgeException("年龄输入有误，应在0-150之间");//抛出异常后，输出异常原因
        }
        else {
            System.out.println("年龄正常");
        }
    }
}
