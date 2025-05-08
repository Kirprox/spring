package com.zaurtregulov.spring.spring_introduction.tests;

import com.zaurtregulov.spring.spring_introduction.Dog;
import com.zaurtregulov.spring.spring_introduction.Person;
import com.zaurtregulov.spring.spring_introduction.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        context.close();
    }
}
