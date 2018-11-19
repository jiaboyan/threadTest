package com.jiaboyan.threadTest;

public class ThreadTest2 implements Runnable{

    @Override
    public void run() {
        System.out.println("新启线程为："+Thread.currentThread().toString());
    }

    public static void main(String[] agrs){
        for(int x=0;x<10;x++){
            new Thread(new ThreadTest2()).start();
        }
        System.out.println("main线程为："+Thread.currentThread().toString());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
