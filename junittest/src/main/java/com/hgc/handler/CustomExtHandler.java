package com.hgc.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: zcs
 * @create: 2019/1/3 9:48
 **/
@RestControllerAdvice
public class CustomExtHandler {

    private static final Logger LOG= LoggerFactory.getLogger(CustomExtHandler.class);

    //捕获全局异常，处理所有不可知的异常
    @ExceptionHandler(value = Exception.class)
    Object handleException(Exception e, HttpServletRequest request){
        LOG.error("url{},msg{}",request.getRequestURI(),e.getMessage());
        Map<String,Object> map=new HashMap<>();
        map.put("code",100);
        map.put("msg",e.getMessage());
        map.put("url",request.getRequestURI());
        return map;
    }

    /**
     * 功能描述：处理自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(value = MyException.class)
    Object handleMyException(MyException e,HttpServletRequest request){
        //进行页面跳转
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("error.html");
//        modelAndView.addObject("msg",e.getMessage());
//        return modelAndView;
        //返回json数据，由前端去判断加载什么页面
        Map<String,Object> map=new HashMap<>();
        map.put("code",e.getCode());
        map.put("msg",e.getMsg());
        map.put("url",request.getRequestURI());
        return map;
    }
}
