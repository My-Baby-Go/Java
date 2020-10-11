package com.StringTest;

public class StringBuilder1 {
    public static void main(String[] args) {
        /*
            无参StringBuilder构造方法
         */
        StringBuilder sb=new StringBuilder();
        System.out.println("sb:"+sb);
        System.out.println("sb长度"+sb.length());

        /*
            有参StringBuilder构造方法
         */
        StringBuilder sb2=new StringBuilder("HelloWorld！");
        System.out.println("sb2:"+sb2);
        System.out.println("sb2长度:"+sb2.length());
    }
}
