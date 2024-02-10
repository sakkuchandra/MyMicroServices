package com.example.demo;

import java.net.URI;
import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/micro2")
@ResponseBody
public class Micro2Controller 
{
	
@GetMapping("/name1")
//@PostMapping("/name1")
	
	public String getDetails()
	{
		//return "Hello";
		
		return "micro2:";
		//return micro2uri.toString();
		
	}
}
