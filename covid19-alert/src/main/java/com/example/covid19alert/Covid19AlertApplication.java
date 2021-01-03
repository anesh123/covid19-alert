package com.example.covid19alert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Covid19AlertApplication {

	public static void main(String[] args) {
		SpringApplication.run(Covid19AlertApplication.class, args);
	}

}
