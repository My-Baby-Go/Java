package com.Object;
/*
    Object类的equals方法比较两个对象是否相等
 */
public class Objectequals {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="彭于晏";
        s1.age=23;

        Student s2=new Student();
        s2.name="彭于晏";
        s2.age=23;

        System.out.println(s1.equals(s2));//未重写equals方法，比较的是两个对象的地址，所以不相等
                                            //重写eauals方法后，比较的是两个对象的内容，这里是相等的

        /*
        未重写时的equals方法，只比较对象地址
        public boolean equals(Object obj) {
            return (this == obj);
        }
         */
    }
}
