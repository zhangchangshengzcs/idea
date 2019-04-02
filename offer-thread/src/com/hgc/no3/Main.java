package com.hgc.no3;

/**
 * @author: zcs
 * @create: 2019/3/7 14:36
 **/
public class Main {
    public static void main(String[] args){
        MyRun1 run1=new MyRun1();
        Thread t=new Thread(run1);
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("===="+i);
        }
    }

}
