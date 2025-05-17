package com.zaurtregulov.aop;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("мы берем книгу из unilibrary: ");
    }

    public void returnBook() {
        System.out.println("мы возвращаем книгу в unilibrary");
    }

    public void getMagazine() {
        System.out.println("мы берем журнал из unilibrary ");

    }

    public void returnMagazine() {
        System.out.println("мы возвращаем журнал в unilibrary ");
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в unilibrary");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в unilibrary");
    }
}
