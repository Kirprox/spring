package com.zaurtregulov.Hibernate_test_2.tests;

import com.zaurtregulov.Hibernate_test_2.entity.Detail;
import com.zaurtregulov.Hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            //первый пользователь
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Zaur", "Tregulov"
//                    , "IT", 500);
//            Detail detail = new Detail("Baku", "123456780","zaurtregulov@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            //второй роботник
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov"
//                    , "Sales", 700);
//            Detail detail = new Detail("Moskow", "987654321","olejka@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//         получаем 1 работника

//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 10);
//            System.out.println(employee.getEmpDetail());
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);
            session.remove(employee);
            System.out.println(employee.getEmpDetail());
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
