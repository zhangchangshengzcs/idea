package com.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy
@SpringBootApplication
public class ItcastSpringcloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItcastSpringcloudGatewayApplication.class, args);
	}

}

