package com.spring;

import java.util.List;
import java.util.Properties;
import java.util.Set;


import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
		
		String paths[] = {"applicationContext.xml","applicationContext-Customer.xml"};
	
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext(paths);
		
	
		
		Customer customer = (Customer)context.getBean("customer");
		System.out.println(customer);
		

	

		
	
	}

}
