package com.bonc.controller;

import com.bonc.service.SleuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcs
 * @create: 2019/1/4 15:18
 **/
@RestController
public class SleuthController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private  SleuthService sleuthService;
    @GetMapping("/same-span")
    public String helloSleuthSameSpan() throws InterruptedException {
        logger.info("Same Span");
        sleuthService.doSomeWorkSameSpan();
        return "success";
    }
}
