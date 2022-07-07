package com.example.spring_course.aop.aspects;

import com.example.spring_course.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
   /* @Before("execution(* com.example.spring_course.aop.University.getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: Logging adding list of students before method getStudents");
    }*/

  /*  @AfterReturning(pointcut = "execution(* com.example.spring_course.aop.University.getStudents())",
    returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);

        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);

        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);


        System.out.println("afterReturningGetStudentsLoggingAdvice: Logging adding list of students after method getStudents");
    }*/

   /* @AfterThrowing(pointcut = "execution(* com.example.spring_course.aop.University.getStudents())",
    throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice: Logging throwing exception " + exception);
    }*/

    @After("execution(* com.example.spring_course.aop.University.getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: Logging normal ending of method or throwing exception");
    }
}
