package com.programmingtechie.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.cloudyrock.spring.v5.EnableMongock;

@SpringBootApplication
@EnableMongock
public class SpringBootMongodbTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbTutorialApplication.class, args);
	}

}
