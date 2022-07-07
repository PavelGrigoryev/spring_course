package com.example.spring_course.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("We took a book from SchoolLibrary");
    }
}
