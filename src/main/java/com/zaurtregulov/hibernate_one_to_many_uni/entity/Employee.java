package com.zaurtregulov.hibernate_one_to_many_uni.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String firstName;
    @Column(name = "surname")
    private String nurname;
    @Column(name = "salary")
    private int salary;

    public Employee() {
    }

    public Employee(String firstName, String nurname, int salary) {
        this.firstName = firstName;
        this.nurname = nurname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", nurname='" + nurname + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNurname() {
        return nurname;
    }

    public void setNurname(String nurname) {
        this.nurname = nurname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
