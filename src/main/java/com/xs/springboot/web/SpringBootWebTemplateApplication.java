package com.xs.springboot.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xs.springboot.web.dao")
public class SpringBootWebTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebTemplateApplication.class, args);
	}
}
