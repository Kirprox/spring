package com.zaurtregulov.aop.tests;

import com.zaurtregulov.aop.Book;
import com.zaurtregulov.aop.MyConfig;
import com.zaurtregulov.aop.SchoolLibrary;
import com.zaurtregulov.aop.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
//        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
//        uniLibrary.returnMagazine();
//        uniLibrary.addBook();
        uniLibrary.getMagazine();

//        uniLibrary.returnBook();
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
