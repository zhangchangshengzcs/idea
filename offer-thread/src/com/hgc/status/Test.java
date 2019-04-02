package com.hgc.status;

/**
 * @author: zcs
 * @create: 2019/3/7 17:56
 **/
public class Test {
    public static void main(String[] args){
        // sleep方法的作用
        new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5 * 1000);// 停顿5秒，在执行后面的内容
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程");
            }
        }.start();

        System.out.println("执行完毕了");

    }

}
