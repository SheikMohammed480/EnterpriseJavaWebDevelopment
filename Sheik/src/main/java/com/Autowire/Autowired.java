package com.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowired {

    public static void main(String[] args) {
    	
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Book b1 = ctx.getBean("book", Book.class);
       System.out.println( b1.getAuthor().getAuthorName());
      b1.getAuthor().setAuthorName("yogesh");
      System.out.println(b1.getAuthor().getAuthorName());
    	}
}
