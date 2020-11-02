package com.spring;

import java.util.List;
import java.util.Properties;
import java.util.Set;


import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
	
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
	
		Employee employee =(Employee) context.getBean("employee");
		System.out.println(employee);
	
	

		
	
	}

}
