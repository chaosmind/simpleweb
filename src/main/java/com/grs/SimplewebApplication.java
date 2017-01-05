package com.grs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimplewebApplication {

	// This is a comment to trigger a Jenkins build
	public static void main(String[] args) {
		SpringApplication.run(SimplewebApplication.class, args);
	}
}
