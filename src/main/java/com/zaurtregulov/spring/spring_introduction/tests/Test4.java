package com.zaurtregulov.spring.spring_introduction.tests;

import com.zaurtregulov.spring.spring_introduction.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("belka");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("strelka");
//
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());
//        System.out.println(myDog == yourDog);
        context.close();

    }
}
