package com.springcloud.commonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CommonserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonserviceApplication.class, args);
	}
}
