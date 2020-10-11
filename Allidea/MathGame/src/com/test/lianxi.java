package com.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class lianxi {
    public static void main(String[] args) {


        /*Object obj=new Object();
        List aList=new ArrayList();
        List bList=new LinkedList();

        long t1=System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            aList.add(0,obj);
        }
        long t2=System.currentTimeMillis()-t1;

        t1=System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            bList.add(0,obj);
        }
        long t3=System.currentTimeMillis()-t1;
        System.out.println(t2);
        System.out.println(t3);*/

        /*Scanner scanner=new Scanner(System.in);
        int sum=0;
        while (scanner.hasNext()){
           int n=scanner.nextInt();
           int m=scanner.nextInt();
           if(n>=100&&m<=999&&n<=m)
           {
               for(int a=n;a<=m;a++)
               {
                   int a1=a/100;
                   int a2=(a%100)/10;
                   int a3=a%10;
                   if(a==(a1*a1*a1+a2*a2*a2+a3*a3*a3))
                   {
                       sum++;
                       if(sum>1)
                       {
                           System.out.print(" "+a);
                       }
                       else
                           System.out.print(a);
                   }
               }
               if(sum==0)
               {
                   System.out.println("no");
               }
               sum=0;
           }

        }*/



       /* int m;
        double sum,n;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            n=sc.nextInt();
            m=sc.nextInt();
            sum=0;
            for(int i=0;i<m;i++){
                sum=sum+n;
                n=Math.sqrt(n);
            }
            System.out.printf("%.2f",sum);
            System.out.println();
        }*/
       /*
       //输入两个数字以空格隔开
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        //创建StringBuilder对象，方便用reverse方法逆序字符串
        StringBuilder sb=new StringBuilder(s);

        //字符串逆序
        StringBuilder st1=sb.reverse();

        //StringBuilder转回String
        String st2=st1.toString();

        //将字符串以空格为分割点分开
        String[] st= s.split(" ");
        String[] s3 = st2.split(" ");

        //存到两个字符串
        String s1=st[0];
        String s2=st[1];

        String s4=s3[0];
        String s5=s3[1];
        //转成int型
        int a=new Integer(s1);
        int b=new Integer(s2);

        int a1=new Integer(s4);
        int b1=new Integer(s5);
        //判断并输出
        if(a*b==a1*b1)
        {
            System.out.println(a+"*"+b+"="+b1+"*"+a1);
        }
        else
        {
            System.out.println(a+"*"+b+"!="+b1+"*"+a1);
        }
        */


       //笔试
        /*int y1, m1,  d1, y2,  m2, d2;
        int sum=0;
        int sum1=0;
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

        String[] st=s.split(",");
        String s1=st[0];
        String s2=st[1];
        String s3=st[2];
        String s4=st[3];
        String s5=st[4];
        String s6=st[5];
        y1=new Integer(s1);
        m1=new Integer(s2);
        d1=new Integer(s3);
        y2=new Integer(s4);
        m2=new Integer(s5);
        d2=new Integer(s6);
        int a1,a2,a3;
        for(a1=1;a1<=y1;a1++)
        {
            for( a2=1;a2<=m1;a2++)
            {
                for ( a3=1;a3<=d1;a3++)
                {
                    sum++;
                    if(sum==8){
                        sum=1;
                    }
                }
            }
        }
        //System.out.println(sum);
        int b1,b2,b3;
        for(b1=y1;b1<=y2;b1++)
        {
            for (b2=m1;b2<=m2;b2++)
            {
                for (b3=d1;b3<=d2;b3++)
                {
                    if(sum>=1&&sum<=5)
                    {
                        sum1++;
                    }
                    sum++;
                    if(sum==8)
                    {
                        sum=1;
                    }
                }
            }
        }
        sum1--;
        //return sum1;*/
    }
    /*int workdays_between(int y1, int m1, int d1, int y2, int m2, int d2) {
        // write code here
        int sum=0;
        int sum1=0;
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

        String[] st=s.split(",");
        String s1=st[0];
        String s2=st[1];
        String s3=st[2];
        String s4=st[3];
        String s5=st[4];
        String s6=st[5];
        y1=new Integer(s1);
        m1=new Integer(s2);
        d1=new Integer(s3);
        y2=new Integer(s4);
        m2=new Integer(s5);
        d2=new Integer(s6);
        int a1,a2,a3;
        for(a1=1;a1<=y1;a1++)
        {
            for( a2=1;a2<=m1;a2++)
            {
                for ( a3=1;a3<=d1;a3++)
                {
                    sum++;
                    if(sum==8){
                        sum=1;
                    }
                }
            }
        }
        //System.out.println(sum);
        int b1,b2,b3;
        for(b1=y1;b1<=y2;b1++)
        {
            for (b2=m1;b2<=m2;b2++)
            {
                for (b3=d1;b3<=d2;b3++)
                {
                    if(sum>=1&&sum<=5)
                    {
                        sum1++;
                    }
                    sum++;
                    if(sum==8)
                    {
                        sum=1;
                    }
                }
            }
        }
        sum1--;
        return sum1;
    }*/

}
