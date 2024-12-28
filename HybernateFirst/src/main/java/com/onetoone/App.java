package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
    {
 	
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate1.cfg.xml");    		
    	SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
    	UserDetails user = new UserDetails();
    	Vehicle vehicle = new Vehicle();    	
    	
    	user.setUserName("Jey");
    	user.setVehicle(vehicle);

    	vehicle.setVehicleName("Thar");

    	Transaction tx = session.beginTransaction();
    	session.persist(user);
    	session.persist(vehicle);

    	tx.commit(); 
    	session.close();
    	factory.close();
    }
}
