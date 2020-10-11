package com.Class4;

public class CompleteTest {
    public static void main(String[] args) {
        /*
            无参构造方法
         */
        Complete c1=new Complete();
        c1.setName("邓江龙");
        c1.setAge(23);
        c1.show();

        /*
            带参构造方法
         */

        Complete c2=new Complete("邓江龙",23);
        c2.show();
    }
}
