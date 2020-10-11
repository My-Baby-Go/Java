package com.ProducectionConsumption;
/*
    生产消费过程
 */
public class Box {
    //定义成员变量，表示第几瓶奶
    private int mike;
    //定义一个表示奶箱状态的成员变量
    private boolean state=false;

    //生产牛奶
    public synchronized void put(int mike){
        //如果有牛奶，等待消费
        if (state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有牛奶，则生产
        this.mike=mike;
        System.out.println("生产了第："+this.mike+"瓶牛奶");

        //生产完毕，修改奶箱状态
        state=true;
        //唤醒其他线程
        notifyAll();
    }

    //消费牛奶
    public synchronized void get(){
        //如果没有牛奶，等待生产
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有牛奶，消费
        System.out.println("消费了第："+this.mike+"瓶牛奶");

        //消费完毕，修改奶箱状态
        state=false;
        //唤醒其他线程
        notifyAll();
    }
}
