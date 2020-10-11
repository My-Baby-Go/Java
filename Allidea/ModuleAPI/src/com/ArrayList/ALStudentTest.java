package com.ArrayList;

import java.util.ArrayList;
/*
    用ArrayList集合和遍历学生类
 */
public class ALStudentTest {
    public static void main(String[] args) {
        //创建集合
        ArrayList<ALStudent> stu=new ArrayList<ALStudent>();
        //创建学生对象
        ALStudent s1=new ALStudent("彭于晏",23);
        ALStudent s2=new ALStudent("胡  歌",23);
        ALStudent s3=new ALStudent("古天乐",23);

        //将学生对象添加到集合中
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);

        //遍历集合
        for(int i=0;i<stu.size();i++)
        {
            ALStudent s=stu.get(i);
            System.out.println(s.getName()+" "+s.getAge());
        }



    }
}
