package com.springcloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient //用于启动服务发现功能
@EnableFeignClients //用于启动Fegin功能
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
		System.out.println("--------------启动Fegin成功-----------------");
	}
}
