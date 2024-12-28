package com.journaldev.spring.autowiring.model;

public class Employee {

	private String name;
	
	Employee()
	{
		System.out.println("Employee child class constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
