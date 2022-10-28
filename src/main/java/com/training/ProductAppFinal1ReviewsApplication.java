package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProductAppFinal1ReviewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppFinal1ReviewsApplication.class, args);
		System.out.println("Review service running on 9091");
	}

}