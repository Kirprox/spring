package com.zaurtregulov.hibernate_many_to_many.tests;

import com.zaurtregulov.hibernate_many_to_many.entity.Child;
import com.zaurtregulov.hibernate_many_to_many.entity.Section;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//            Section section1 = new Section("Dance");
//            Child child1 = new Child("Olya", 12);
//            Child child2 = new Child("grisha", 8);
//            Child child3 = new Child("Pavlik", 9);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//
//            session.getTransaction().commit();
//            System.out.println("done!");
            //**************************************************
//            session = factory.getCurrentSession();
//            Section section1 = new Section("volleyball");
//            Section section2 = new Section("chess");
//            Section section3 = new Section("math");
//            Child child1 = new Child("Igor", 10);
//            child1.addSectionToChield(section1);
//            child1.addSectionToChield(section2);
//            child1.addSectionToChield(section3);
//
//            session.beginTransaction();
//
//            session.persist(child1);
//
//
//            session.getTransaction().commit();
//            System.out.println("done!");
            //**************************************************
//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//            Section child = session.get(Section.class, 3);
//            System.out.println(child);
//            System.out.println();
//            System.out.println(child.getChildren());
//
//            session.getTransaction().commit();
//            System.out.println("done!");
            //**********************************************

//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//            Child child = session.get(Child.class, 7);
//            System.out.println(child);
//            System.out.println();
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("done!");
            //******************************************************
            session = factory.getCurrentSession();


            session.beginTransaction();
            Child child = session.get(Child.class, 8);
            session.remove(child);

            session.getTransaction().commit();
            System.out.println("done!");
            //*****************************************************
        } finally {
            session.close();
            factory.close();
        }
    }
}
