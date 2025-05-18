package com.zaurtregulov.aop.aspects;

import com.zaurtregulov.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* com.zaurtregulov.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//
//    }
//
//    @Pointcut("execution(public void com.zaurtregulov.aop.UniLibrary.returnMagazine())")
//    private void returnMagazinFromUniLibrary() {
//
//
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazinFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {
//
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("allMethodsExceptReturnMagazineFromUniLibrary() log 10");
//    }


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


    @Before("com.zaurtregulov.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature= " + methodSignature);
        System.out.println("methodSignature.getMethod= " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType= " + methodSignature.getReturnType());
        System.out.println("methodSignature.getMethodName= " + methodSignature.getName());
        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("информация о книге: название книги " +
                            myBook.getName() + ", автор - " + myBook.getAuthor() +
                            ", год издания " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("книгу в библиотеку добавил " + obj);
                }
            }
        }
        System.out.println("beforeGetLoggingAdvice: логирование попытки получить книгу/журнал");
        System.out.println("-----------------------------------------------");
    }
}

