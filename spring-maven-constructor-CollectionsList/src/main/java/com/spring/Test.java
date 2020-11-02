package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	
	public static void main(String[] args) {
	
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
	
	
		
		Department department = (Department)context.getBean("department");
	
	System.out.println(department);
	
	 Map<String, Employee>  employees = department.getEmployees();
	 
	 Set<String> keys = employees.keySet();
	
	int count = 1;
	
	for (String key : keys) {
		
		Employee employee = (Employee) employees.get(key);
		
		System.out.println("Employees"+count+" "+" Information");
		employee.Displayemployees();
		count++;
		
	}
	
	
	

		
	
	}

}
