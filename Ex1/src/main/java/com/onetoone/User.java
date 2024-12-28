package com.onetoone;

import javax.persistence.*;


@Entity
@Table(name="User_detail")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int UserId;
	
	@Column(name="User_Name")
	private String username;
	
	@OneToOne
	@JoinColumn(name="VehicleId")
	private Vehicle vehicle;

	public int getId() {
		return UserId;
	}

	public void setId(int id) {
		this.UserId = UserId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
	
	

	
}
