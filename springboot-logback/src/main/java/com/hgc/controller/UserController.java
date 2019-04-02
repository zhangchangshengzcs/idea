package com.hgc.controller;

import com.hgc.domain.JsonData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcs
 * @create: 2019/3/13 11:56
 **/
@RestController
@RequestMapping("/api")
public class UserController {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @GetMapping("/testLog")
    public Object testLog(){
        logger.debug("this is debug");
        logger.info("this is info");
        logger.warn("this is warn");
        logger.error("this is error");
        return JsonData.buildSuccess();
    }
}
