package com.Sample;

public class Company {
	private Employee employee;
	public Company(Employee employee)
	{
		this.employee=employee;//store the employee object in employee property
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
	}
	
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.setName("sheik");
		e1.setAge(21);
		
		
				
		Company c1=new Company(e1);//passing object as an argument
	}

}
