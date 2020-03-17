package com.siit.tema3.library;

import java.util.ArrayList;
import java.util.Arrays;


public class LibraryCatalog {
    public static void main(String[] args) {
        int amount = 0;
        ArrayList<Book> Books = new ArrayList<Book>();

        Book cartea1 = new Novel("Razboiul stelelor", 1, 160, 1965, 1);

        Books.add(cartea1);
        amount = amount + 1;

        Book cartea2 = new Album("Poze de acasa", 0, 50, 2020, "High");
        Books.add(cartea2);
        amount = amount + 1;

        Book cartea3= new Novel("Stapanul Inelelor", 1,645,2008,2);
        Books.add(cartea3);
        amount = amount + 1;


        for (int i = 0; i <= amount - 1; i++) {
            if (Books.get(i).getAmount() == 1) {
                System.out.println("Cartea numarul " + (i + 1) +" este un roman si se numeste " + Books.get(i).getName() + " si are " + Books.get(i).getPageNumbers() + " de pagini " +
                        "; tiparit in anul " + Books.get(i).getYearOfRelease());
            } else {
                System.out.println("Cartea numarul " + (i + 1) + " este un album si se numeste " + Books.get(i).getName() + " si are " + Books.get(i).getPageNumbers() + " de pagini " +
                        "; tiparit in anul " + Books.get(i).getYearOfRelease());
            }
        }
    }
}







