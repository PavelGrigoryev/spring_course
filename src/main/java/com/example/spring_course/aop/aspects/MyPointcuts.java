package com.example.spring_course.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* com.example.spring_course.aop.UniLibrary.abc*(..))")
    public void allAddMethods() {
    }
}
