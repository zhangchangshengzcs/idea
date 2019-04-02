package com.bonc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author: zcs
 * @create: 2019/1/4 15:13
 **/
@Service
public class SleuthService {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    public void doSomeWorkSameSpan() throws InterruptedException {
        Thread.sleep(1000L);
        logger.info("Doing some work");
    }
}
