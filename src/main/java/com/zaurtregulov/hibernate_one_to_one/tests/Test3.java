package com.zaurtregulov.hibernate_one_to_one.tests;

import com.zaurtregulov.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            List<Employee> emps = session.createQuery("from Employee")
//                    .getResultList();
            List<Employee> emps = session.createQuery("from Employee " +
                            "where name = 'Alexander' AND salary > 650")
                    .getResultList();

            for (Employee e : emps) {
                System.out.println(e);
            }

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
