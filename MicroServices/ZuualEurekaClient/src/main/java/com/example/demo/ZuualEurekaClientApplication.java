package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication


public class ZuualEurekaClientApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(ZuualEurekaClientApplication.class, args);
	}
	
	//@GetMapping("/Client")
	@RequestMapping
	public String SayHello()
	{
		return "This is MicroService";
	}

}
