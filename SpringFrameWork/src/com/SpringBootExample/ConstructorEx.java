package com.SpringBootExample;

public class ConstructorEx {
	private String name;
	private int age;
	public ConstructorEx()
	{
		System.out.println("constructor is running");
	}
	public ConstructorEx(String name,int age)
	{
		this.name=name;
	
		this.age=age;
	}
	
	public  void dis()
	{
		System.out.println("Your name is : "+name+" "+"age is: "+age);
	}
	
	
}
