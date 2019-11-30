package com.example.onlineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages = "com.example.onlineservice.repository")
public class SpringBootRabbitMqHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRabbitMqHelloWorldApplication.class, args);
	}

}
