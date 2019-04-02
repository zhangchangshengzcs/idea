package com.hgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
//@ComponentScan(basePackages={"com.hgc"})
@EnableFeignClients(basePackages={"com.hgc"})
//@ComponentScan(basePackages={"com.hgc"})
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class ItcastSpringcloud2Application {

	@Bean // 向Spring容器中定义RestTemplate对象
	@LoadBalanced//开启负载均衡
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(ItcastSpringcloud2Application.class, args);
	}

}

