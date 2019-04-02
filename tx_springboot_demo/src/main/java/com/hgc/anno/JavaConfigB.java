package com.hgc.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigB {
    @Bean("BMW")
    public Car getBMW(){
        return new BMW();
    }
}
