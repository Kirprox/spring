package com.zaurtregulov.spring.spring_introduction.configs;

import com.zaurtregulov.spring.spring_introduction.Cat;
import com.zaurtregulov.spring.spring_introduction.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Cat mycat = context.getBean("cat", Cat.class);
//        mycat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
