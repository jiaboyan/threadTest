package com.jiaboyan.threadTest;

public class ThreadTest8 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("新启动线程：" + i);
            Thread.yield();
        }
    }

    public static void main(String[] agrs){
        new Thread(new ThreadTest8()).start();
        System.out.println("新线程启动了");
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程：" + i);
            Thread.yield();
        }
    }
}
