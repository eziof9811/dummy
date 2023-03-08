package com.example.shoppingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableWebMvc
@EnableEurekaClient
@SpringBootApplication
public class ShoppingserviceApplication {
	
	@LoadBalanced 

	@Bean 

	public RestTemplate getTemplate () { 

	return new RestTemplate(); 

	} 

	public static void main(String[] args) {
		SpringApplication.run(ShoppingserviceApplication.class, args);
	}

}
