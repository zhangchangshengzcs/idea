package com.hgc.controller;

import com.hgc.domain.JsonData;
import com.hgc.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @author: zcs
 * @create: 2019/3/12 16:19
 **/
@RestController
@RequestMapping("/api/schedule")
public class AsyncController {
    @Autowired
    private AsyncTask asyncTask;
    @GetMapping("/async_task")
    public JsonData exeTask() throws InterruptedException {
        long begin=System.currentTimeMillis();
//        asyncTask.task1();
//        asyncTask.task2();
//        asyncTask.task3();
        Future<String> task4=asyncTask.task4();
        Future<String> task5=asyncTask.task5();
        Future<String> task6=asyncTask.task6();
        for (;;){
            if (task4.isDone()&&task5.isDone()&&task6.isDone()){
                break;
            }
        }
        long end=System.currentTimeMillis();
        long total=end-begin;
        System.out.println("执行总耗时："+total);
        return JsonData.buildSuccess(total);

    }
}
