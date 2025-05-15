package com.zaurtregulov.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public void get*())")
    public void beforeGetBoookAdvice() {
        System.out.println("beforeGetBoookAdvice: попытка получить книгу");
    }

    @Before("execution( * returnBook())")
    public void beforeRetuntBoookAdvice() {
        System.out.println("beforereturnBoookAdvice: попытка вернуть книгу");
    }
}

