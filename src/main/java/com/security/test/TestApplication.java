package com.security.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan(value = "com.*")
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(TestApplication.class);
		builder.headless(false);
		builder.run(args);
	}
	
}
