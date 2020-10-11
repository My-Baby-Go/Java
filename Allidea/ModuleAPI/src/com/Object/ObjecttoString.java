package com.Object;
/*
    查看方法的源码，选中方法按下ctrl+B 或 ctrl+点击方法
 */
public class ObjecttoString {
    public static void main(String[] args) {
        Student s=new Student();
        s.name="彭于晏";
        s.age=23;
        System.out.println(s);//未重写toString方法时返回的值：com.Object.Student@1b6d3586
                              //在Student类里重写toString类后：Student{name='彭于晏', age=23}

        //Object类里是这样返回上面的s的：return getClass().getName() + "@" + Integer.toHexString(hashCode());

    }
}
