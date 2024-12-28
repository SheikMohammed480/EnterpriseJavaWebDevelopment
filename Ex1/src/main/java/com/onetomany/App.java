package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate2.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx = null;
	try {
		tx=session.beginTransaction();
		Actor actor1=new Actor();	
		actor1.setActorName("rajini");
		actor1.setAge(72);
		actor1.setSalary("500_000");
		
		Actor actor2=new Actor();
		actor2.setActorName("thamana");
		actor2.setAge(42);
		actor2.setSalary("100_000");
	
		Actor actor3=new Actor();
		actor3.setActorName("mohan Lal");
		actor3.setAge(55);
		actor3.setSalary("400_000");
		
		
		List<Actor> actorList=new ArrayList<>();
		actorList.add(actor1);
		actorList.add(actor2);
		actorList.add(actor3);
		
		Movie movie=new Movie();
		movie.setMovieName("Jailer");
		movie.setActors(actorList);
		
		
		session.persist(movie);
		
		
		tx.commit();
	}catch(Exception e)
	{
		if(tx!=null)
			tx.rollback();
		e.printStackTrace();
	}
	
	finally {	
		session.close();
		factory.close();
	}
	}

}
