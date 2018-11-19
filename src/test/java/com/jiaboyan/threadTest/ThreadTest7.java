package com.jiaboyan.threadTest;

public class ThreadTest7 implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("守护线程中，我会执行吗？");
        }
    }

    public static void main(String[] agrs){
        Thread thread = new Thread(new ThreadTest7());
        thread.setDaemon(true);
        thread.start();
        System.out.println("守护线程启动");
    }
}
