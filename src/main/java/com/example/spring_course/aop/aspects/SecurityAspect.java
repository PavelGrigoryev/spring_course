package com.example.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("com.example.spring_course.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeAddSecurityAdvice: Checking the bill of a book or a magazine");
        System.out.println("-".repeat(30));
    }
}
