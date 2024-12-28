package com.Manytoone;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="User")

public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int UserId;
	
	@Column(name="UserName")
	private String username;
	
	@Column(name="userAge")
	private int age;
	

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	
	
}
