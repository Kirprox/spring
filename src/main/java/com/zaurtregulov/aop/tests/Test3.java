package com.zaurtregulov.aop.tests;

import com.zaurtregulov.aop.MyConfig;
import com.zaurtregulov.aop.Student;
import com.zaurtregulov.aop.UniLibrary;
import com.zaurtregulov.aop.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("метод мейн начало");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = library.returnBook();
        System.out.println("в библиотеку вернули книгу " + bookName);
        context.close();
        System.out.println("метод мейн конец");
    }
}
