package com.siit.tema3.library;

import java.util.Scanner;

public class Book {
    private String name;
    private int amount;
    private int pageNumbers;
    private int yearOfRelease;



    public Book(String name, int amount, int pageNumbers, int yearOfRelease) {
        this.name = name;
        this.amount = amount;
        this.pageNumbers = pageNumbers;
        this.yearOfRelease = yearOfRelease;


    }




    public String getName() {
        return name;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }


    public int getAmount() {
        return amount;
    }
}

