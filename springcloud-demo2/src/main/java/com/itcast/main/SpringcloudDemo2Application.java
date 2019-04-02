package com.itcast.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//声明这是一个Eureka服务
@SpringBootApplication
public class SpringcloudDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudDemo2Application.class, args);
	}

}

