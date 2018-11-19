package com.jiaboyan.threadTest;

public class ThreadTest13 {
    //创建一把锁
    private static Object obj = new Object();

    private static ThreadTest13 threadTest13;

    private ThreadTest13(){}

    public static ThreadTest13 getInstance(){
        if(threadTest13==null){
            synchronized (obj){
                if(threadTest13==null){
                    threadTest13 = new ThreadTest13();
                }
            }
        }
        return threadTest13;
    }
}
