package com.SpringBootExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class ConsTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Cons.xml");
		ConstructorEx c=context.getBean("cons",ConstructorEx.class);
		 
		c.dis();

	}

}
