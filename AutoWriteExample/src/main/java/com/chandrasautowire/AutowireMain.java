package com.chandrasautowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain 
{
	@SuppressWarnings("resource")
	
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee e=(Employee)context.getBean("emp");
        e.setEname("chandra");
        e.setEid(1002);
        e.showEmployeeDetails();
	}

}
