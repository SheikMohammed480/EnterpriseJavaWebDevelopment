package com.Manytomany;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main(String[] args)
    {
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate4.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
   
        Student student1 = new Student("Simba");
        Student student2 = new Student("Rocky");

        Project project1 = new Project("AI Research", "Research on AI technologies", "2024-12-31");
        Project project2 = new Project("Web Development", "Developing a new web application", "2024-09-30");

        
        List<Project> projectsForStudent1 = new ArrayList<>();
        projectsForStudent1.add(project1);
        projectsForStudent1.add(project2);

        List<Project> projectsForStudent2 = new ArrayList<>();
        projectsForStudent2.add(project1);

        student1.setProjects(projectsForStudent1);
        student2.setProjects(projectsForStudent2);

        
        session.save(student1);
        session.save(student2);
        transaction.commit();
        
        
        session.close();
        
       
        factory.close();
    }
}

