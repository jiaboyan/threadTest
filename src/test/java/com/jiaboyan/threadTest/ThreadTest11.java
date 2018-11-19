package com.jiaboyan.threadTest;

public class ThreadTest11 {
    private static ThreadTest11 single = new ThreadTest11();
    private ThreadTest11(){}
    //饿汉：
    public static ThreadTest11 getInstance(){
        return single;
    }
}
