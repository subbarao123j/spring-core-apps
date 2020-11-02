package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
	
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
	
	
		
		Department department = (Department)context.getBean("department");
	
	System.out.println(department);
	
	List<Employee> list = department.getEmployees();
	
	int count = 1;
	
	for (Employee employee : list) {
		
		System.out.println("Employees"+count+" "+" Information");
		employee.Displayemployees();
		count++;
		
	}
	
	
	

		
	
	}

}
