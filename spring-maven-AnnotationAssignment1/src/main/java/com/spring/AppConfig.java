package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {

	@Bean

	public AccountService accountService() {

		return new AccountService();

	}

	@Bean

	public EmployeeService employeeService() {

		return new EmployeeService();

	}
}
