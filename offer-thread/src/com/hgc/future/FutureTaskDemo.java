package com.hgc.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: zcs
 * @create: 2019/3/7 15:45
 **/
public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task=new FutureTask<String>(new MyCallable());
        new Thread(task).start();
        if (!task.isDone()){
            System.out.println("task has not finished,please wait");
        }
        System.out.println("task return:"+task.get());
    }

}
