package com.siit.tema3.library;

public class Novel extends Book {

   private int type;
   int amount=getAmount();


    public Novel(String name, int amount, int pageNumbers, int yearOfRelease, int novel, int album, int type) {
        super(name, amount, pageNumbers, yearOfRelease, novel, album);
        this.type=type;
    }
}

