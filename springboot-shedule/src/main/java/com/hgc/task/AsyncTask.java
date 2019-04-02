package com.hgc.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @description: 异步任务业务类
 * @author: zcs
 * @create: 2019/3/12 15:57
 **/
@Component
@Async //在类中加此注解，全部方法都是异步方法
public class AsyncTask {
//    @Async
    public void task1() throws InterruptedException {
        long begin=System.currentTimeMillis();
        Thread.sleep(1000L);
        long end=System.currentTimeMillis();
        System.out.println("任务1耗时="+(end-begin));
    }
//    @Async
    public void task2() throws InterruptedException {
        long begin=System.currentTimeMillis();
        Thread.sleep(2000L);
        long end=System.currentTimeMillis();
        System.out.println("任务2耗时="+(end-begin));
    }
//    @Async
    public void task3() throws InterruptedException {
        long begin=System.currentTimeMillis();
        Thread.sleep(3000L);
        long end=System.currentTimeMillis();
        System.out.println("任务3耗时="+(end-begin));
    }
    public Future<String> task4() throws InterruptedException {
        long begin=System.currentTimeMillis();
        Thread.sleep(2000L);
        long end=System.currentTimeMillis();
        System.out.println("任务4耗时="+(end-begin));
        return new AsyncResult<String>("任务4");
    }
    public Future<String> task5() throws InterruptedException {
        long begin=System.currentTimeMillis();
        Thread.sleep(3000L);
        long end=System.currentTimeMillis();
        System.out.println("任务5耗时="+(end-begin));
        return new AsyncResult<String>("任务5");
    }
    public Future<String> task6() throws InterruptedException {
        long begin=System.currentTimeMillis();
        Thread.sleep(1000L);
        long end=System.currentTimeMillis();
        System.out.println("任务6耗时="+(end-begin));
        return new AsyncResult<String>("任务6");
    }
}
