package com.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE1")
public class Vehicle
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="VEHICLE_ID")
private int vehicleId;

@Column(name="VEHICLE_NAME")
private String vehicleName;

public int getVehicleId() {
return vehicleId;
}
public void setVehicleId(int vehicleId) {
this.vehicleId = vehicleId;
}
public String getVehicleName() {
return vehicleName;
}
public void setVehicleName(String vehicleName) {
this.vehicleName = vehicleName;
}
}


