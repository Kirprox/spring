package com.zaurtregulov.spring.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

//    @Autowired
    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }
//    public Person() {
//        System.out.println("Person bean is created");
//    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("class person:set surname");
        this.surname = surname;
    }

    public int getAge() {
        System.out.println("");
        return age;
    }

    public void setAge(int age) {
        System.out.println("class person set age");
        this.age = age;
    }


    public void setPet(Pet pet) {
        System.out.println("Class Person set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("hello,my lovely Pet!");
        pet.say();
    }
}
