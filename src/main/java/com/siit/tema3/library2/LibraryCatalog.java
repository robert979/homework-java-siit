package com.siit.tema3.library2;

import com.siit.tema3.library.Book;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;

@ToString

public class LibraryCatalog {


    public static void main(String [] args){
        ArrayList<Books> book = new ArrayList<Books>();

        Novel novel1 = new Novel("Razboiul Stelelor",125,"SF");
       
        book.add(novel1);
        System.out.println(novel1.getName() + novel1.getPageNumbers() +novel1.getType());

        Album album1 =new Album("Acesta devine prima carte", 65, "high");
        book.add(album1);
        System.out.println(album1.getName() +" " + album1.getPageNumbers() + " " +album1.getPaperQuality());

      Album album2= new Album("Poze din oras", 25, "High");
      book.add(album2);
        System.out.println();

     book.remove(book.get(0));
        System.out.println(book.get(0).getName());

    }


}
