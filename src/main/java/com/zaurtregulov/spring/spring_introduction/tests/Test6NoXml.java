package com.zaurtregulov.spring.spring_introduction.tests;

import com.zaurtregulov.spring.spring_introduction.Person;
import com.zaurtregulov.spring.spring_introduction.noxml.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6NoXml {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        context.close();
    }
}
