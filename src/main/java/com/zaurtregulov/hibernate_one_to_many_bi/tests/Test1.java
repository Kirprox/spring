package com.zaurtregulov.hibernate_one_to_many_bi.tests;

import com.zaurtregulov.hibernate_one_to_many_bi.entity.Department;
import com.zaurtregulov.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
            //добавление
//            session = factory.getCurrentSession();
////            Department dep = new Department("sale",800,1500);
////            Employee emp1 = new Employee("Zaur","Tregulov", 800);
////            Employee emp2 = new Employee("Elena","Smirnova", 1500);
////            Employee emp3 = new Employee("Anton","Sidorov", 1200);
////            dep.addEmployeeToDepartment(emp1);
////            dep.addEmployeeToDepartment(emp2);
////            dep.addEmployeeToDepartment(emp3);
////
////            session.beginTransaction();
////            session.persist(dep);
////
////            session.getTransaction().commit();
////            System.out.println("Done!");
// *********************************************************************
//чтение
            session = factory.getCurrentSession();

            session.beginTransaction();
            System.out.println("Get department");
            Department department = session.get(Department.class, 6);

            System.out.println("show department");
            System.out.println(department);

            System.out.println("подгрузим роботников");
            department.getEmps().get(0);
            session.getTransaction().commit();
            System.out.println("show employees of the department");
            System.out.println(department.getEmps());
            System.out.println("Done!");
// *********************************************************************
//удаление
//            session = factory.getCurrentSession();/////удаление
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 4);
//            session.remove(employee);
//            session.getTransaction().commit();
//            System.out.println("Done!");
            //типы загрузок

//

        } finally {
            session.close();
            factory.close();
        }
    }
}
