package com.spring;

import org.springframework.beans.factory.BeanNameAware;

public class Employee implements BeanNameAware{

	private String Id;

	private String name;

	private float salary;

	public void init() {

		System.out.println("employee bean is initializing");

	}

	public void destroy() {

		System.out.println("Employee bean garbage collector");
	}

	public void setId(String id) {
		Id = id;
	}

	public void setName(String name) {

		System.out.println("Setter injection is  going on for name dependency");
		this.name = name;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
	public void displayData() {
		
		System.out.println("Emp id "+Id);
		System.out.println("Emp name "+name);
		System.out.println("Emp salary "+salary);
		
		
		
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", salary=" + salary + "]";
	}

	 
	

//	@Override
//	public String toString() {
//		return "Employee [Id=" + Id + ", name=" + name + ", salary=" + salary + "]";
//	}

}
