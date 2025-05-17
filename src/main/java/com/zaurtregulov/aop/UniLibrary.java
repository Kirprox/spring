package com.zaurtregulov.aop;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary extends AbstractLibrary {
    public void getBook(Book book) {
        System.out.println("мы берем книгу из unilibrary: " + book.getName());
    }

    public String returnBook() {
        System.out.println("мы возвращаем книгу в unilibrary");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("мы берем журнал из unilibrary ");

    }
}
