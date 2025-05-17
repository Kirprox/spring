package com.zaurtregulov.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* com.zaurtregulov.aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {

    }

    @Pointcut("execution(public void com.zaurtregulov.aop.UniLibrary.returnMagazine())")
    private void returnMagazinFromUniLibrary() {


    }

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazinFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {

    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("allMethodsExceptReturnMagazineFromUniLibrary() log 10");
    }


//    @Before("execution(* getBook(..))")
//    public void beforeAnyGetBookMethod() {
//        System.out.println("AOP работает: метод getBook вызван");
//    }
//    @Pointcut("execution(* com.zaurtregulov.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* com.zaurtregulov.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary() { // ← ИМЯ метода тут важно!
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice()Log 1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice() Log 2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice() {
//        System.out.println("beforeGetAndReturnLoggingAdvice Log 3");
//    }


//    @Pointcut("execution(* get*())")
//    private void allGetMethods() {
//
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: попытка получить книгу/журнал");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
//    }
}

