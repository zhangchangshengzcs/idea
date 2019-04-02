package com.hgc.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: zcs
 * @create: 2019/1/4 17:04
 **/
@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/api2/*/**").excludePathPatterns("/api2/xxx/**");//拦截全部
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
