package com.hgc.no1;

/**
 * @author: zcs
 * @create: 2019/3/7 14:09
 **/
public class ThreadTest {
    private static void attack(){
        System.out.println("Fight");
        System.out.println("current thread is ;"+Thread.currentThread().getName());
    }
    public static void main(String[] args){
        Thread t=new Thread(){
            @Override
            public void run() {
                attack();
            }
        };
        System.out.println("current main thread is :"+Thread.currentThread().getName());
        t.run();
    }

}
