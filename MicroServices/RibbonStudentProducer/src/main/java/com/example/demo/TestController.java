package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
   @RequestMapping(value="/student",method=RequestMethod.GET)
	public Student firstPage()
	{
		Student s=new Student();
		s.setName("abc");
		s.setsId("1");
		return s;
	}
	
}
