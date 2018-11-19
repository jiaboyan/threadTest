package com.jiaboyan.threadTest;

public class ThreadTest3 implements Runnable{
    @Override
    public void run() {
        System.out.println("新启线程的优先级为："+Thread.currentThread().getPriority());
    }

    public static void main(String[] agrs){
        Thread.currentThread().setPriority(10);
        System.out.println("设置main线程的优先级为："+Thread.currentThread().getPriority());
        for(int x=0;x<10;x++){
            Thread thread = new Thread(new ThreadTest3());
            if(x%2==0){
                thread.setPriority(7);
            }
            thread.start();
        }
        System.out.println("main线程为："+Thread.currentThread().toString());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
