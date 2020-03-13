package com.siit.tema3.library;

import java.util.Scanner;

public class Book {
    private String name;
    private int amount;
    private int pageNumbers;
    private int yearOfRelease;
    private int Novel;
    private int Album;

    public Book(String name, int amount, int pageNumbers, int yearOfRelease, int novel, int album) {
        this.name = name;
        this.amount = amount;
        this.pageNumbers = pageNumbers;
        this.yearOfRelease = yearOfRelease;
        Novel = novel;
        Album = album;
    }

    public void add (int addBook){
        amount+=addBook;
        if (getNovel()==1 && getAlbum()==0){
            amount+=addBook;
            System.out.println("Un nou roman cu titlul" + getName() + "a fost adaugat ");

        }
        else if (getAlbum()==1 && getNovel()==0){
            amount+=addBook;
            System.out.println("Un nou album cu titlul" + getName() + "a fost adaugat ");
        }
        else {
            System.out.println("Cartea nu a fost introdusa deoarece nu face parte nici din categoria Album si nici categoria Roman");
        }
    }
     public void remove (int removeBook){

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

    public int getNovel() {
        return Novel;
    }

    public int getAlbum() {
        return Album;
    }

    public int getAmount() {
        return amount;
    }
}

