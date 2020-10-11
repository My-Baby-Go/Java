package com.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetTest {
    public static void main(String[] args) throws UnknownHostException {
        //确定主机名称的IP地址，可以是机器名称也可以是IP地址
        InetAddress address=InetAddress.getByName("DESKTOP-SJ3HPQ3");
//        InetAddress address=InetAddress.getByName("192.168.56.1");
        //获取此IP地址的主机名
        String name=address.getHostName();
        //返回文本显示中的IP地址字符串
        String ip=address.getHostAddress();
        System.out.println(name);
        System.out.println(ip);
    }
}
