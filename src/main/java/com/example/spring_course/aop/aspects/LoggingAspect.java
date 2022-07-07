package com.example.spring_course.aop.aspects;

import com.example.spring_course.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

   /* @Pointcut("execution(* com.example.spring_course.aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {
    }

    @Pointcut("execution(public void com.example.spring_course.aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {
    }

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {
    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
    }*/

  /*  @Pointcut("execution(* com.example.spring_course.aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* com.example.spring_course.aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {
    }

    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
    private void allGetAndReturnMethodsFromUniLibrary() {

    }

    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }

    @Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }

    @Before("allGetAndReturnMethodsFromUniLibrary()")
    public void beforeGetAndReturnLoggingAdvice() {
        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
    }*/


    @Before("com.example.spring_course.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            Arrays.stream(arguments).forEach(obj -> {
                if (obj instanceof Book myBook) {
                    System.out.println("Information about a book: name - " + myBook.getName() + ", author - " +
                            myBook.getAuthor() + ", year of publication - " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("Book is adding to the library by " + obj);
                }
            });
        }

        System.out.println("beforeAddLoggingAdvice: Logging -> trying to get a book or a magazine");
        System.out.println("-".repeat(30));
    }


}
