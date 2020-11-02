package com.spring;


public class Employee {

	
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void Displayemployees() {
		
		System.out.println("Emp id "+id);
		System.out.println("emp name="+name);
		
		
	}
	
}//dependent class
