package com.Maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        try {
            session.beginTransaction();
            Song song1 = new Song();
            song1.setId(16);
            song1.setActorName("vijay");
            song1.setMovieName("ghilli");
            session.save(song1);

            // Create and save the second song
            Song song2 = new Song();
            song2.setId(17);
            song2.setActorName("ajith");
            song2.setMovieName("mangatha");
            session.save(song2);

            // Create and save the third song
            Song song3 = new Song();
            song3.setId(15);
            song3.setActorName("suriya");
            song3.setMovieName("singam");
            session.save(song3);
            session.save(song1);

            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }

}
