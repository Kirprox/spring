package com.zaurtregulov.aop.aspects;

import com.zaurtregulov.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UnivrsityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: " +
//                "логируем получение списка студентов пред методом getStudents");
//    }

    //    @AfterReturning(pointcut = "execution(* getStudents())"
//            , returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "mister"+nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: " +
//                "логируем получение списка студентов после работы метода getStudents");
//    }
//    @AfterThrowing(pointcut = "execution(* getStudents())"
//    , throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice(): логируем выброс исключения"+exception);
//    }

//    @After("execution(* getStudents())")
//    public void afterGetStudentsLoggingAdvice() {
//        System.out.println("afterGetStudentsLoggingAdvice :" +
//                "логгируем нормальное окончание работы метода или выброс исключения");
//    }
}
