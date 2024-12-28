package com.Manytomany;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate5.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
			Question q1 = new Question();
			Question q2 = new Question();
			q1.setQname("What is Java?");
			q2.setQname("What is a computer?");
			
			Answer a1 = new Answer();
			a1.setResponse("Java is a programming language.");
			Answer a2 = new Answer();
			a2.setResponse("Java is platform-independent.");
			Answer a3 = new Answer();
			a3.setResponse("A computer is an electronic machine.");
			Answer a4 = new Answer();
			a4.setResponse("A computer interacts with humans through a desktop.");

			Set<Answer> answersForQ1 = new HashSet<>();
			answersForQ1.add(a1);
			answersForQ1.add(a2);
			q1.setAnswers(answersForQ1);

			Set<Answer> answersForQ2 = new HashSet<>();
			answersForQ2.add(a3);
			answersForQ2.add(a4);
			q2.setAnswers(answersForQ2);
			
			session.save(q1);
			session.save(q2);
			
			tx.commit();
		
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}
	}
}