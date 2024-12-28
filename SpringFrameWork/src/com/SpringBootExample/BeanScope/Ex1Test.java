package com.SpringBootExample.BeanScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex1Test {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans1.xml");
      Ex1 objA = context.getBean("helloWorld",Ex1.class);
      //or
    //  Ex1 objA =(Ex1)context.getBean("helloWorld");

      objA.setMessage("I'm object A");
      objA.getMessage();

      Ex1 objB = (Ex1) context.getBean("helloWorld");
      objB.getMessage();
      objB.setMessage("I'm object B");
      objB.getMessage();

   }
}
