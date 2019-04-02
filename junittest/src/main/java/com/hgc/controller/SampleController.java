package com.hgc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcs
 * @create: 2019/1/2 17:17
 **/
@RestController
public class SampleController {
    @GetMapping("/home")
    public String home(){
        return "junit";
    }
}
