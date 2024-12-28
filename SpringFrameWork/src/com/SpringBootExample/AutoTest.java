package com.SpringBootExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Auto.xml");
		TextEditor text=context.getBean("Auto",TextEditor.class);
		text.run();
	}

}
