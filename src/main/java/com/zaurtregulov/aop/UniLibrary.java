package com.zaurtregulov.aop;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("мы берем книгу из unilibrary: ");
        System.out.println("-----------------------------------------------");

    }

    public String returnBook() {
        System.out.println("мы возвращаем книгу в unilibrary");
        return "Война и мир";
    }

    public void getMagazine() {
        System.out.println("мы берем журнал из unilibrary ");
        System.out.println("-----------------------------------------------");

    }

    public void returnMagazine() {
        System.out.println("мы возвращаем журнал в unilibrary ");
        System.out.println("-----------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавляем книгу в unilibrary");
        System.out.println("-----------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в unilibrary");
        System.out.println("-----------------------------------------------");
    }
}
