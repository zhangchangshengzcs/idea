package com.hgc.controller;

import com.hgc.bean.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/getUser")
    public User getUser(){
        User user=new User();
        user.setUserName("hello1");
        user.setPassWord("123456");
        return user;
    }
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
