package com.SpringBootExample.BeanScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExTest {

	   public static void main(String[] args) {
		      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		      Ex objA = (Ex) context.getBean("helloWorld");

		      objA.setMessage("I'm object A");
		      objA.getMessage();

		      Ex objB = (Ex) context.getBean("helloWorld");
		      objB.getMessage();
		   }
		}

