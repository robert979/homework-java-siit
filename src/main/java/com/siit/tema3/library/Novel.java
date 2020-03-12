package com.siit.tema3.library;

public class Novel extends Book {

    private String type;

    public Novel(String name, int pageNumbers, int yearOfRelease, int amount, String type) {
        super(name, pageNumbers, yearOfRelease, amount);
        this.type=type;

    }



    }

