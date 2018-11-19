package com.jiaboyan.threadTest;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest6 implements Runnable{
    @Override
    public void run() {
        while(true){
//            if(Thread.currentThread().isInterrupted()){
//                System.out.println("我被中断了");
//            }else{
//                System.out.println("我一直在运行");
//            }
            try {
                Thread.sleep(1000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("终于明白sleep会抛出异常了捕获异常了");
            }
        }
    }

    public static void main(String[] agrs){
        Thread thread = new Thread(new ThreadTest6());
        thread.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
