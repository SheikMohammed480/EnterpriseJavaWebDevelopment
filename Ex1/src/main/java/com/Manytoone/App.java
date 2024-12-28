package com.Manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate4.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			User u1=new User();
			Laptop l1=new Laptop();
			
			l1.setLaptopBrand("acer");
			l1.setLaptopModel("nitro 5");
			l1.setUser(u1);
			
			Laptop l2=new  Laptop();
			l2.setLaptopBrand("Lenovo");
			l2.setLaptopModel("IdeaPad");
			l2.setUser(u1);
			
			
			
			
			u1.setUsername("sheik");
			u1.setAge(21);
			
			
			
			session.persist(l1);
			session.persist(l2);
			tx.commit();
		}catch(Exception e)
		{
			if(tx!=null)
			{
				tx.rollback();
			}
			e.printStackTrace();
		}
		finally{
			session.close();
			factory.close();
		}

	}

}
