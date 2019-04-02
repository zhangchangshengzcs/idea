package com.hgc.no4;

/**
 * @author: zcs
 * @create: 2019/3/7 14:44
 **/
public class CycleWait implements Runnable {
    private String value;
    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value="we have data now";

    }
    public static void main(String[] args) throws InterruptedException {
        CycleWait cw=new CycleWait();
        Thread t=new Thread(cw);
        t.start();
//        while (cw.value==null){
//            Thread.currentThread().sleep(1000);
//        }//主线程等待法
        t.join();//使用Thread类的join()阻塞当前线程以等待子线程处理完毕
        System.out.println("value:"+cw.value);
    }

}
