/* 
 * Author ::. Sivateja Kandula | www.java4s.com 
 *
 */

package com.java4s.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java4s.model.Customer;

@RestController
public class SpringJava4sController {

	@PostMapping(path="/save-cust-info")
	public String customerInformation(@RequestBody Customer cust) 
	{

		/* You can call your DAO logic here.
		 * For time being I am printing the customer data just to show the POST call is working.
		 */
		
		return "Customer information saved successfully ::."+ cust.getCustNo()+ " " +cust.getName()+ " " +cust.getCountry();
	}
}

// URL: http://localhost:8080/spring-boot-restful-post-json/save-cust-info
/*
 * Request
 * {
	"custNo" : 100,
	"name" : "Google",
	"country": "United States"
   }
 * 
 * */
