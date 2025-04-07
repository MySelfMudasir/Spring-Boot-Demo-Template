package com.example.testApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);

		System.out.println("=================================================");
		System.out.println("               Project is running");
		System.out.println("=================================================");
	}

}
