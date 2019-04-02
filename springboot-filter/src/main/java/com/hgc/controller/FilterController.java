package com.hgc.controller;

import com.hgc.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: zcs
 * @create: 2019/1/3 14:24
 **/
@RestController
public class FilterController {

    @RequestMapping("/api/index")
    public Object index(){
        return new User(11,"index",new Date());
    }
}
