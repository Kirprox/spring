package com.zaurtregulov.spring.spring_introduction.tests;

import com.zaurtregulov.spring.spring_introduction.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog mydog = context.getBean("dog",Dog.class);
        mydog.say();
//        Dog yourdog = context.getBean("dog",Dog.class);
//        System.out.println(mydog == yourdog);
//
//        System.out.println(mydog);
//        System.out.println(yourdog);

        context.close();
    }
}
