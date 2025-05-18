package com.zaurtregulov.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingApect {
    @Before("com.zaurtregulov.aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetExceptionHandlingadvice() {
        System.out.println("beforeGetExceptionHandlingadvice() ловим/обрабатываем исключение " +
                "при попытке получить книгк/журнал");
    }
}
