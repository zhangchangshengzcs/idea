package com.hgc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zcs
 * @create: 2019/3/28 13:57
 **/
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WinxinController {
    @GetMapping("/auth")
    public void auth(){
        log.info("进入auth方法。。。");
    }
}
