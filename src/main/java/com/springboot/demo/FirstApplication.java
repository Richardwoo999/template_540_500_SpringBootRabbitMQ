package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping(value = "/template_540_500_SpringBootRabbitMQ")
public class FirstApplication {
	@RequestMapping(value = "/index")
	public String index(){
		return "您好,SpringBoot001";
	}
	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}
}
