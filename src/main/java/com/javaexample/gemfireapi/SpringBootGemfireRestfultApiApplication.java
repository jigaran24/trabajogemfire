package com.javaexample.gemfireapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
@EnableGemfireRepositories
@SpringBootApplication
public class SpringBootGemfireRestfultApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGemfireRestfultApiApplication.class, args);
	}
}
