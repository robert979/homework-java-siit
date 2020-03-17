package com.siit.tema3.library;

public class Novel extends Book {

   private int type;



    public Novel(String name, int amount, int pageNumbers, int yearOfRelease, int type) {
        super(name, amount, pageNumbers, yearOfRelease);
        this.type=type;
    }
}

