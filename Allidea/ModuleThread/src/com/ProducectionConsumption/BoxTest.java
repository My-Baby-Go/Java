package com.ProducectionConsumption;
/*
    生产消费问题
 */
public class BoxTest {
    public static void main(String[] args) {
        //创建奶箱对象，共享数据区域
        Box box=new Box();

        //创建生产者对象，把奶箱对象作为构造方法参数传递，因为这个类要调用生产牛奶的操作
        Producer p=new Producer(box);
        //创建消费者对象，把奶箱对象作为构造方法参数传递，因为这个类要调用消费牛奶的操作
        Customer c=new Customer(box);

        //创建两个线程，分别把生产者和消费者对象作为构造方法参数传递
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);

        //启动线程
        t1.start();
        t2.start();
    }
}
