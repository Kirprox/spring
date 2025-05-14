package com.zaurtregulov.spring.spring_introduction.tests;

import com.zaurtregulov.spring.spring_introduction.Person;
import com.zaurtregulov.spring.spring_introduction.Pet;
import com.zaurtregulov.spring.spring_introduction.noxml.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6NoXml2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
//        Pet cat1 = context.getBean("catBean",Pet.class);
//        Pet cat2 = context.getBean("catBean",Pet.class);
//        cat.say();
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
//        Person person2 = context.getBean("personBean", Person.class);
//        person.callYourPet();
        context.close();
    }
}
