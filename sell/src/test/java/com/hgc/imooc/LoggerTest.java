package com.hgc.imooc;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: zcs
 * @create: 2019/3/15 14:28
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j  //使用此注解可以不再每次获取Logger对象
public class LoggerTest {
//    private final Logger logger= LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        String name="imooc";
        String password="123456";
        log.debug("debug....");
        log.info("name:"+name+"password:"+password);
        log.info("name:{},password:{}",name,password);//{}表示一个占位符
        log.error("error...");
        log.warn("warn......");
    }
}
