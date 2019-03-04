package com.cloud.study.cqs.feginclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeginclientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeginclientDemoApplication.class, args);
	}

}
