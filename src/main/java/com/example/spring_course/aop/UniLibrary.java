package com.example.spring_course.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We took a book from UniLibrary ");
        System.out.println("-".repeat(30));
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("We returning a book to UniLibrary");
        return "War and Peace";
    }

    public void getMagazine() {
        System.out.println("We took a magazine from UniLibrary ");
        System.out.println("-".repeat(30));
    }

    public void returnMagazine() {
        System.out.println("We returning a magazine to UniLibrary");
        System.out.println("-".repeat(30));
    }

    public void addBook(String person_name, Book book) {
        System.out.println("We adding a book to UniLibrary");
        System.out.println("-".repeat(30));
    }

    public void addMagazine() {
        System.out.println("We adding a magazine to UniLibrary");
        System.out.println("-".repeat(30));
    }

}
