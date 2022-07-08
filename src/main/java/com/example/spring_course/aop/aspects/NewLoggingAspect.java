package com.example.spring_course.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String com.example.spring_course.aop.UniLibrary.returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: the book is trying to return to the library");

        Object targetMethodResult;

        //long begin = System.currentTimeMillis();
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: we catch an exception " + e);
            throw e;
        }
        //long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: the book is successful return to the library");
        //System.out.println("aroundReturnBookLoggingAdvice: method returnBook done his job for " + (end - begin) + " millis");

        return targetMethodResult;
    }
}
