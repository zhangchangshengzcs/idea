package com.xdclass.controller;

import com.xdclass.domain.User;
import com.xdclass.utils.JsonUtils;
import com.xdclass.utils.RedisClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private RedisClient redisClient;
	@Test
	public void testOne(){
		User user=new User();
		user.setAge(1);
		user.setPhone("22222");
		user.setPwd("0000");
		String str= JsonUtils.obj2String(user);
		stringRedisTemplate.opsForValue().set("str",str);
	}

	@Test
	public void contextLoads() {
	}

}

