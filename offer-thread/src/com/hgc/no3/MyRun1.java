package com.hgc.no3;

/**
 * @author: zcs
 * @create: 2019/3/7 14:36
 **/
public class MyRun1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("A"+i);
        }
    }
}
