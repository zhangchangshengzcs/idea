package com.hgc.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {
    @RequestMapping("/hello2")
    public String sayHello(){
        return "hello worldtest2";
    }
}
