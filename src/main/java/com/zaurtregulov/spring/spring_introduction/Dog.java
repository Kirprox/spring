package com.zaurtregulov.spring.spring_introduction;

public class Dog implements Pet {
//    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    protected void init(){
        System.out.println("class dog init method");
    }
    private void destroy(){
        System.out.println("class dog destroy method");
    }

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("bow-bow");
    }
}
