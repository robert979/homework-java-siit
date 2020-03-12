package com.siit.tema3.library;

import java.util.Scanner;

public class Book {
    private String name;
    private int pageNumbers;
    private int yearOfRelease;
    private int amount;

    public Book(String name, int pageNumbers, int yearOfRelease, int amount) {
        this.name = name;
        this.pageNumbers = pageNumbers;
        this.yearOfRelease = yearOfRelease;
        this.amount=amount;
    }

    public void add (int addBook ){
        this.amount=+addBook;
        System.out.println();
    }

    public void remove (int removeBook){
        this.amount=-removeBook;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
