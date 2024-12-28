package com.SpringBootExample.BeanScope;

public class Ex {
	private String message;

	public void getMessage() {
		System.out.println("your message is:"+ message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
