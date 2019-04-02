package com.hgc.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**@description: 定时任务业务类
 * @author: zcs
 * @create: 2019/3/12 14:51
 **/
@Component  //被容器扫描
public class TestTask {
//    @Scheduled(fixedDelay = 2000)//定时任务：2秒执行一次
//    @Scheduled(cron = "*/2 * * * * *")
    public void sum() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("当前时间："+new Date());
    }
}
