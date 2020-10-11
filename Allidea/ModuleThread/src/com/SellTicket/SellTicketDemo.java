package com.SellTicket;

public class SellTicketDemo implements Runnable{
    //定义总票数
    private int tickets=100;
    //创建一把锁
    Object obj=new Object();
    //卖票过程
    @Override
    public void run() {
        while (true){
            //同步代码块
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + (101 - tickets) + "张票");

                    tickets--;
                }
            }
        }
    }
}
