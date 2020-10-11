package com.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo implements Runnable{
    //定义总票数
    private int tickets=100;
    //创建Lock锁
    Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            //开启锁
            try{
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + (101 - tickets) + "张票");
                    tickets--;
                }
            }finally {
                //释放锁
                lock.unlock();
            }
        }
    }
}
