package com.jiaboyan.threadTest;

public class ThreadTest10 {
    private static ThreadTest10 single;
    private ThreadTest10(){}
    //懒汉：
    public static ThreadTest10 getInstance(){
        if(single==null){
            single = new ThreadTest10();
        }
        return single;
    }
}
