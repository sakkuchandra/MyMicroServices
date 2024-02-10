package com.example.demo;

import org.apache.http.protocol.HTTP;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value="/api")
public class ProductController 
{
	static Faker faker=new Faker();
    
	@GetMapping("/product")
	@HystrixCommand(fallbackMethod = "defaultResponse")
	public ResponseEntity<Product>getProduct()
	{
		Product p=new Product();
		p.setId(10);
		p.setName(faker.commerce().productName());
		p.setDepartment(faker.commerce().department());
		p.setPrice(faker.commerce().price());
		
		if(p.getId()==10)
			throw new RuntimeException();
		return new ResponseEntity<Product>(p,HttpStatus.OK);
	}
	
	public ResponseEntity<Product>defaultResponse()
	{
		Product p1=new Product();
		p1.setId(90);
		p1.setName("Dummy Name");
		p1.setDepartment("Dummy Department");
		p1.setPrice("0");
		return new ResponseEntity<Product>(p1,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
