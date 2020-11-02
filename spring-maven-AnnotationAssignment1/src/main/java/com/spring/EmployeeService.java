package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class EmployeeService {
	
	@Autowired
	
	private AccountService accountService;

	@Override
	public String toString() {
		return "EmployeeService [accountService=" + accountService + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	
	

}
