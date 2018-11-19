package com.jiaboyan.threadTest;

public class ThreadTest12 implements Runnable {

    @Override
    public void run() {
        ThreadTest11 singele = ThreadTest11.getInstance();
        System.out.println(singele);
    }

    public static void main(String[] agrs){
        ThreadTest12 threadTest12 = new ThreadTest12();
        new Thread(threadTest12).start();
        new Thread(threadTest12).start();
        new Thread(threadTest12).start();
        new Thread(threadTest12).start();
    }
}
