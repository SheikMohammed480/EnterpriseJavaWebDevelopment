package com.SpringBootExample.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ABTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("AB.xml");
		A a=context.getBean("a",A.class);
		a.display();

	}

}
