package com.SpringBootExample.BeanScope;


public class Ex3 {
	  private String name;
	  private String age;

	  // Constructor 1
	  public Ex3() {
	  }

	  // Constructor 2
	  public Ex3(String name, String age) {
	    this.name = name;
	    this.age = age;
	  }

	  // Method inside POJO class
	  @Override
	  public String toString() {

	    // Print student class attributes
	    return "Student{" + "name='" + name + '\'' + ", age='" + age + '\'' + '}';
	  }
	  public static void main(String[] args) {
		  Ex3 ex=new Ex3();
		 System.out.println( ex.toString());
	  }
	}


