package com.example.demo;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("/micro2")
public class Micro1Controller 
{
	@Autowired
	DiscoveryClient discoveryclient;
	
	 @Autowired
	   RestTemplate restTemplate;
	 
	 String micro2Respone;
	
	@GetMapping("/name")
	
	public String getMicroServiceName()
	{
		List<ServiceInstance> list=discoveryclient.getInstances("micro2");
		ServiceInstance service2=list.get(0);
		URI micro2uri=service2.getUri();
		ResponseEntity<String> response=new RestTemplate().getForEntity(micro2uri+"/micro2/name1",String.class);
		HttpStatus status = response.getStatusCode();
		String micro2response = response.getBody();
		return response.getStatusCode() == HttpStatus.OK ? response.getBody() : null;
		
	}
	
	/*
	@GetMapping("/getmicro2/{name}")
	   public String getMicro2Instance(@PathVariable String name)
	   {
	       String url = "http://micro2/";
	       micro2Respone = "Currently hitting instance running on port: "
	                   + restTemplate.getForObject(url, String.class);
	       return "micro1" + ":" + micro2Respone;
	   }
  */
}
