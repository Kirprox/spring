package com.zaurtregulov.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
    public void getBook() {
        System.out.println("мы берем книгу из scoollibrary");
    }
}
