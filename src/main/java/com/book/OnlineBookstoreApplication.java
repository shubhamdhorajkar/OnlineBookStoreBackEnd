package com.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class OnlineBookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookstoreApplication.class, args);
	}

}
