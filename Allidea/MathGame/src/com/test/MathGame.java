package com.test;
import java.util.Scanner;
import java.util.Random;


public class MathGame {
    public static void  main(String[] args)
    {
        Random math=new Random();
        int num=math.nextInt(100)+1;
        Scanner s=new Scanner(System.in);
        while (true)
        {
            System.out.println("请输入你要猜的数字");
            int guess=s.nextInt();
            if(guess>num)
            {
                System.out.println("你猜的数字太大了");
            }
            else if (guess<num)
            {
                System.out.println("你猜的数字太小了");
            }
            else
            {
                System.out.println("恭喜你猜对了");
                break;
            }
        }

    }
}
