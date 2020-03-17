package com.siit.tema3.library;

import java.util.Scanner;

public class Album extends Book {
    private String paperQuality;


    public Album(String name, int amount, int pageNumbers, int yearOfRelease, String paperQuality) {
        super(name, amount, pageNumbers, yearOfRelease);
        this.paperQuality=paperQuality;
    }
}


