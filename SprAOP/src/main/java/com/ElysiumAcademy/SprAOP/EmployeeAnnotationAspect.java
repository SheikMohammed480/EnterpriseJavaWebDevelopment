package com.ElysiumAcademy.SprAOP;

import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

	@Before("@annotation(com.ElysiumAcademy.SprAOP.Loggable)")
	public void myAdvice(){
		System.out.println("Executing myAdvice!!");
	}
}
