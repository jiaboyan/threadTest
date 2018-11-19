package com.jiaboyan.threadTest;

public class ThreadTest14 {
    public static StringBuffer craeteStringBuffer(String s1, String s2) {
        StringBuffer sb = new StringBuffer();
        sb.append(s1);
        sb.append(s2);
        return sb;
    }
   public static void main(String[] agrs){
       long tsStart = System.currentTimeMillis();
       for (int i = 0; i < 2000000; i++) {
           StringBuffer sb = craeteStringBuffer("jiabo","yan");
       }
       System.out.println("一共耗费：" + (System.currentTimeMillis() - tsStart) + " ms");
   }
}
