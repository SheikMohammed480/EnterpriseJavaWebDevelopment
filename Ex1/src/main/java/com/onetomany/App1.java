package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App1 {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate3.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx = null;
		try {
		
		tx=session.beginTransaction();
		
		Book b1=new Book();
		b1.setBookName("The God's Messenger(Muhammad SAW)");
		
		Book b2=new Book();
		b2.setBookName("Believe in only one God(ALLAH SWT)");
		
		List<Book> b=new ArrayList<>();
		b.add(b1);
		b.add(b2);
		
		Author a=new Author();
		a.setAuthorName("sheik");
		a.setAuthorAge(21);
		a.setBook(b);
		
		session.persist(a);
		tx.commit();
		}catch(Exception e)
		{
			if(tx!=null)
			{
				tx.rollback();
				
			}
			e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
		

	}

}
