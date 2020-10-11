package com.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    日期类的使用方法
    构造方法：SimpleDateFormat，构造默认日期格式或给定日期格式
    格式化：从Date到String   //format
    解析：从String到Date     //parse
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        //创建Date对象
        Date d = new Date();
        //格式化：从Date到String

        //默认格式
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s1 = sdf.format(d);
        System.out.println(s1);

        //自己规定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String s2 = sdf2.format(d);
        System.out.println(s2);

        //解析：从String到Date
        //创建日期字符串
        String ss="1949-10-01 00:00:00";
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d2=new Date();
        Date dd = sdf3.parse(ss);//此处会报异常，按Alt+回车 选择提供的解决办法自动解决，见第14行的throws ParseException
        System.out.println(dd);
    }
}
