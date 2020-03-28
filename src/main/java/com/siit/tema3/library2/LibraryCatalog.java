package com.siit.tema3.library2;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;

@ToString
@EqualsAndHashCode

public class LibraryCatalog {


    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();

        Novel novel1 = new Novel("Razboiul Stelelor", 125, "SF");

        books.add(novel1);
        System.out.println(novel1.getName() + novel1.getPageNumbers() + novel1.getType());

        Album album1 = new Album("Acesta devine prima carte", 65, "high");
        books.add(album1);
        System.out.println(album1.getName() + " " + album1.getPageNumbers() + " " + album1.getPaperQuality());

        Album album2 = new Album("Poze din oras", 25, "High");
        books.add(album2);
        System.out.println();

        books.remove(books.get(0));
        Book book = books.get(0);

        if (book instanceof Album) {
            Album albm = (Album) book;
            System.out.println(albm.getPaperQuality());
        }


    }


}
