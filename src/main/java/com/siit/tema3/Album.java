package com.siit.tema3;

public class Album extends Book {
    private String paperQuality;

    public Album(String name, int pageNumbers, int yearOfRelease, int amount, String paperQuality) {
        super(name, pageNumbers, yearOfRelease, amount);
        this.paperQuality=paperQuality;
    }
}

