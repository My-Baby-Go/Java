package com.Set;

import java.util.Comparator;
import java.util.TreeSet;

/*
    对学生成绩排序
 */
public class ScoreTest {
    public static void main(String[] args) {
        TreeSet<Score> ts=new TreeSet<Score>(new Comparator<Score>() {
            @Override
            public int compare(Score s1, Score s2) {
                //主要条件
                int num=s2.getSum()-s1.getSum();
                //次要条件
                int num2=num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        Score s1=new Score("彭于晏",90,100);
        Score s2=new Score("胡歌",100,95);
        Score s3=new Score("张一山",95,98);
        Score s4=new Score("科比",90,100);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for(Score s:ts){
            System.out.println(s.getName()+" "+s.getChinse()+" "+s.getMath()+" "+s.getSum());
        }
    }
}
