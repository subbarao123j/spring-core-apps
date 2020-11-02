package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		
		  AccountService accountService = (AccountService)context.getBean(AccountService.class);
		  
		  Account account = accountService.getAccountInfo();
		  
		  System.out.println(account);
		  
		  
		  
		  //System.out.println(account.getAccountNo());
		  
		 // System.out.println(account.getBalance());
		 

		/*EmployeeService employeeService = (EmployeeService) context.getBean(EmployeeService.class);

		System.out.println(employeeService.toString());*/

	}
}
