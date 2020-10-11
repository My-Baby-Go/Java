package com.Set;
/*
    返回哈希值测试
    哈希值：JDK根据对象的地址或字符串或数字算出来的int型的数值

 */
public class HashTest {
    public static void main(String[] args) {
        Student s1=new Student("彭于晏",23);
        Student s2=new Student("彭于晏",23);
        //多次返回同一对象，哈希值不变
        System.out.println(s1.hashCode());//460141958
        System.out.println(s1.hashCode());//460141958
        //不同对象哈希值不同
        System.out.println(s2.hashCode());//1163157884
        System.out.println("--------");

        System.out.println("hello".hashCode());//99162322
        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("--------");

        System.out.println("中国".hashCode());//642672
        System.out.println("湖南".hashCode());//896961

        //有些字符串的哈希值一样，重写了Hashcode方法
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}
