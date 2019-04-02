package com.xdclass.controller;

import com.xdclass.domain.JsonData;
import com.xdclass.domain.User;
import com.xdclass.utils.JsonUtils;
import com.xdclass.utils.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: zcs
 * @create: 2019/3/12 9:20
 **/
@RestController
@RequestMapping("/api/redis")
public class RedisTestController {
    @Autowired
    private StringRedisTemplate redisTemplate;//类似jdbcTemplate
    @Autowired
    private RedisClient redisClient;
    @GetMapping("/add")
    public Object add(){
//        redisTemplate.opsForValue().set("name","xdClass");
        redisClient.set("name2","test");
        return JsonData.buildSuccess();
    }
    @GetMapping("/get")
    public Object get(){
//        String value=redisTemplate.opsForValue().get("name");
        String value=redisClient.get("name2");
        return JsonData.buildSuccess(value);
    }
    @GetMapping("/save_user")
    public Object saveUser(){
        User user=new User(1,"abc","11",new Date());
        String userStr= JsonUtils.obj2String(user);
        boolean flag=redisClient.set("base:user:11",userStr);
        return JsonData.buildSuccess(flag);
    }
    @GetMapping("/find_user")
    public Object findUser(){
        String userStr=redisClient.get("base:user:11");
        User user=JsonUtils.string2Obj(userStr,User.class);
        return JsonData.buildSuccess(user);
    }
}
