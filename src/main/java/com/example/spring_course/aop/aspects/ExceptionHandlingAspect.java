package com.example.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("com.example.spring_course.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeAddExceptionHandlingAdvice: Catching exceptions with trying to get book/magazine");
        System.out.println("-".repeat(30));
    }
}
