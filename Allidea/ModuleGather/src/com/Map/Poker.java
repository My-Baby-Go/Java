package com.Map;

import java.util.ArrayList;
import java.util.Collections;

/*
    斗地主：
    创建牌盒，用ArrayList
    往牌盒装牌，循环数组
    洗牌，Collections的shuffle()方法实现
    发牌，遍历集合
    看牌，遍历集合
    ♦，♣，♠，♥
 */
public class Poker {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        String[] math={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color={"♦","♣","♠","♥"};
        //普通循环
        /*for(int i=0;i<color.length;i++)
        {
            for (int j=0;j<math.length;j++)
            {
                array.add(color[i]+math[j]);
            }
        }*/

        //增强for循环
        for(String c:color){
            for (String m:math){
                arr.add(c+m);
            }
        }
        arr.add("大王");
        arr.add("小王");
//        System.out.println(arr);
        Collections.shuffle(arr);
//        System.out.println(arr);

        //发牌，遍历集合给三个人
        ArrayList<String> pyy=new ArrayList<>();
        ArrayList<String> ljj=new ArrayList<>();
        ArrayList<String> hg=new ArrayList<>();
        ArrayList<String> dp=new ArrayList<>();

        //普通循环
        for (int i=0;i<arr.size();i++)
        {
            String poker = arr.get(i);
            if(i>=arr.size()-3){
                dp.add(poker);
            }else if(i%3==0){
                pyy.add(poker);
            }else if(i%3==1){
                ljj.add(poker);
            }else {
                hg.add(poker);
            }
        }
        //看牌
        lookpoker("彭于晏",pyy);
        lookpoker("林俊杰",ljj);
        lookpoker("胡歌",hg);
        lookpoker("底牌",dp);
    }
    //看牌方法
    public static void lookpoker(String name,ArrayList<String> array){
        System.out.print(name+"的牌是：");
        for (String poker:array){
            System.out.print(poker+" ");
        }
        System.out.println(" ");
    }
}
