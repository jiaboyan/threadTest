package com.jiaboyan.threadTest;

//卖票的例子：
public class ThreadTest9 implements Runnable {

    //可售总数量 100张：
    private Integer count = 100;

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(true) {
            //如果大于0，就进行卖票
            if(count>0) {
                synchronized (this) {
                    if(count>0){
                        System.out.println(Thread.currentThread().getName() + "正在售票，剩余票数：" + count--);
                        continue;
                    }
                }
            }
            System.out.println(Thread.currentThread().getName()+"票源不足，此时可售票数为："+ count);
            break;
        }
    }

    public static void main(String[] agrs){
        ThreadTest9 ticket = new ThreadTest9();
        new Thread(ticket,"窗口1").start();
        new Thread(ticket,"窗口2").start();
        new Thread(ticket,"窗口3").start();
        new Thread(ticket,"窗口4").start();
    }
}
