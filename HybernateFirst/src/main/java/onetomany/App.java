package onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate2.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Actors a1 = new Actors();
            a1.setActorName("Rajinikanth");
            a1.setAge(72);
            a1.setSalary(50_000_000); // 50 million

            Actors a2 = new Actors();
            a2.setActorName("Mohanlal");
            a2.setAge(63);
            a2.setSalary(40_000_000); // 40 million

            List<Actors> actorsList1 = new ArrayList<>();
            actorsList1.add(a1);
            actorsList1.add(a2);

            Movie m1 = new Movie();
            m1.setName("JAILER");
            m1.setActors(actorsList1);

            session.persist(m1);

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
