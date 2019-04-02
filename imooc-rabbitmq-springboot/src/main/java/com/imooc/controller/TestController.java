package com.imooc.controller;

import com.imooc.rabbitmq.HelloReceiver;
import com.imooc.rabbitmq.HelloSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcs
 * @create: 2019/1/22 15:58
 **/
@RestController
public class TestController {
    @Autowired
    private HelloSender helloSender;

    @GetMapping("hello")
    public String helloTest(){
        helloSender.send();
        return "success";
    }
    @Autowired
    private HelloReceiver helloReceiver;
    public String receive(){
        helloReceiver.process("hello world");
        return "sucesss";
    }
}
