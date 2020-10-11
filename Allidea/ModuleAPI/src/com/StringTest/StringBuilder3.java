package com.StringTest;

/*
    public String toString()：通过toString()方法把StringBuilder转换成String
    public StringBuilder(string s):通过构造方法把String转换成StringBuilder
 */
public class StringBuilder3 {
    public static void main(String[] args) {

        //StringBuilder转换成String
        StringBuilder sb=new StringBuilder();
        sb.append("Hello");
        /*
            错误方法
            String s=sb;
         */
        //正确方法，通过toString()
        String s=sb.toString();
        System.out.println(s);

        //String转换成StringBuilder
        String s2="World";
        /*
               错误方法
               StringBuilder sb2=s;
         */

        //正确方法，通过StringBuilder
        StringBuilder sb2=new StringBuilder(s2);
        System.out.println(sb2);
    }
}
