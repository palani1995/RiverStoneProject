package com.riverstone.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootRiverStoneProject extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRiverStoneProject.class, args);
		System.out.println("Hello world..!!");
	}
}
