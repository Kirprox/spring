package com.zaurtregulov.spring.spring_introduction;

public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat been is created");
    }

    @Override
    public void say() {
        System.out.println("meow-meow");
    }
}
