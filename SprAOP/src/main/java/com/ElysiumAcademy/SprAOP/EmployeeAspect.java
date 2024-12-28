package com.ElysiumAcademy.SprAOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {

	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getName()");
		System.out.println("Update your jio app");
	}
	
	@Before("execution(*  com.ElysiumAcademy.spring.service.*.get*())")
	public void getAllAdvice(){
		System.out.println("Service method getter called");
	}
}
