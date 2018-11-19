package com.jiaboyan.threadTest;

public class ThreadTest1 extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("新启线程为："+Thread.currentThread().getName());

    }

    public static void main(String[] agrs){
        ThreadTest1 threadTest11 = new ThreadTest1();
        threadTest11.setDaemon(true);
//        ThreadTest1 threadTest12 = new ThreadTest1();
        threadTest11.start();
//        threadTest12.start();
        System.out.println("main线程为："+Thread.currentThread().getName());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
