package com.hgc.no2;

/**
 * @author: zcs
 * @create: 2019/3/7 14:27
 **/
public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i=0;i<1000;i++){
            System.out.println("A"+i);
        }
    }
}
