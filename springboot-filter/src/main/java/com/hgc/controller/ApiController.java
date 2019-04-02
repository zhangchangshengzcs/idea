package com.hgc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcs
 * @create: 2019/1/4 17:28
 **/
@RestController
public class ApiController {
    @GetMapping("/api2/test1")
    public String testOne(){
        return "test";
    }
}
