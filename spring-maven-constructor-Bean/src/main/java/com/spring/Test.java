package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
	
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
	
	
		
	Employee employee = (Employee)context.getBean("employee");
	
	System.out.println(employee);
	

	
	
	
//	
//	
//	employee.displayData();
//
//	context.close();
//	
//	employee = (Employee)context.getBean("employee");
//	employee.displayData();

	
		
	
	}

}
