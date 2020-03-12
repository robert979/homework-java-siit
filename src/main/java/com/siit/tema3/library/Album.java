package com.siit.tema3.library;

import java.util.Scanner;

public class Album extends Book {
    private String paperQuality;

   public Album(String name, int pageNumbers, int yearOfRelease, int amount, String paperQuality) {
        super(name, pageNumbers, yearOfRelease, amount);
        this.paperQuality=paperQuality;

        Scanner newAlbum = new Scanner(System.in);
       System.out.println( " introduceti");
       Book x = new Book(newAlbum.nextLine(), newAlbum.nextInt(),newAlbum.nextInt(),newAlbum.nextInt());


    }
}

