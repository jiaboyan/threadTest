package com.jiaboyan.threadTest;

import java.util.ArrayList;
import java.util.List;

public class ThreadTest5 implements Runnable{
    @Override
    public void run() {
        System.out.println("新启线程："+Thread.currentThread().toString());
    }

    public static void main(String[] agrs){
        List<Thread> list = new ArrayList<Thread>();
        for(int x=0;x<10;x++){
            Thread thread = new Thread(new ThreadTest5());
            list.add(thread);
            thread.start();
        }
        for(Thread thread:list){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main继续做事，main线程为："+Thread.currentThread().toString());
    }
}
