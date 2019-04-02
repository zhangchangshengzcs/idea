package com.hgc.threadpool;

import java.util.concurrent.Callable;

/**
 * @author: zcs
 * @create: 2019/3/7 15:28
 **/
public class MyCallable implements Callable<String>{
    @Override
    public String call() throws Exception {
        String value="test";
        System.out.println("Ready to work");
        Thread.currentThread().sleep(5000);
        System.out.println("task done");
        return value;
    }
}
