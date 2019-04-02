package com.hgc.no2;

public class Main {
    //会重新启动一个线程
    public static void main(String[] args) {
        // write your code here
        MyThread1 t1 = new MyThread1();
        t1.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("+++++++" + i);
        }
    }
}
