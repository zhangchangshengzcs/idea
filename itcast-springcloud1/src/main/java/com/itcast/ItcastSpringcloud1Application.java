package com.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient//声明Eureka客户端
@SpringBootApplication
public class ItcastSpringcloud1Application {

	public static void main(String[] args) {
		SpringApplication.run(ItcastSpringcloud1Application.class, args);
	}

}

