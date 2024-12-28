package com.SpringBootExample.Autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class A {
	
	B b;
	public A() {
		System.out.println("A's constructor is running");
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	
	public void start()
	{
		System.out.println("hello A");
	}
	public void display()
	{
		start();
		b.display();
	}
}
