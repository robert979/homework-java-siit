package com.siit.tema3.ciorna.library;

public class Album extends Book {
    private String paperQuality;


    public Album(String name, int amount, int pageNumbers, int yearOfRelease, String paperQuality) {
        super(name, amount, pageNumbers, yearOfRelease);
        this.paperQuality=paperQuality;
    }
}


