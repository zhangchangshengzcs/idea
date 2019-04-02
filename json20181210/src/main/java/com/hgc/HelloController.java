package com.hgc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/getDemo")
    public Demo getDemo() {
        Demo demo = new Demo();
        demo.setId(2);
        demo.setName("zhangsan");
        demo.setCreateTime(new Date());
        demo.setRemarks("这是序列化属性");
        return demo;
    }
    @RequestMapping("/hello3")
    public String hello3(){
        return "hello3";
    }
}
