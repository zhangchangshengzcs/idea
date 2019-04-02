package com.hgc.controller;

import com.hgc.handler.MyException;
import com.hgc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: zcs
 * @create: 2019/1/3 9:34
 **/
@RestController
public class ExceptionController {

    /**
     * 功能描述：模拟全局异常
     * @return
     */
    @RequestMapping("/index")
    public Object index(){
        int i=1/0;
        return new User(11,"index",new Date());
    }

    /**
     * 功能描述：模拟自定义异常
     * @return
     */
    @RequestMapping("/myexc")
    public Object myexc(){
        throw new MyException("499","myexception异常");
    }
}
