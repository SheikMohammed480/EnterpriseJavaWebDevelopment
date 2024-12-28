package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate1.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory(); 
		Session session=factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		User user=new User();
		Vehicle vehicle=new Vehicle();
		user.setUsername("sheik");
		user.setVehicle(vehicle);
		User user1=new User();
		user1.setUsername("sharmi");
		Vehicle vehicle1=new Vehicle();
		user1.setVehicle(vehicle1);
		vehicle1.setVehicleName("rolls royce");
		
		vehicle.setVehicleName("Lamborgini");
		
		session.persist(user);
		session.persist(vehicle);
		session.persist(user1);
		session.persist(vehicle1);
		
		tx.commit();
		session.close();
		factory.close();
		

	}

}
