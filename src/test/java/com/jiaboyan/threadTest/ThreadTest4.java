package com.jiaboyan.threadTest;

public class ThreadTest4 implements Runnable{
    @Override
    public void run() {
        System.out.println("新启线程："+Thread.currentThread().toString());
        try {
            Thread.sleep(100);
            System.out.println("新启线程停止500毫秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] agrs){
        for(int x=0;x<10;x++){
            Thread thread = new Thread(new ThreadTest4());
            thread.start();
        }
        System.out.println("main线程为："+Thread.currentThread().toString());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
