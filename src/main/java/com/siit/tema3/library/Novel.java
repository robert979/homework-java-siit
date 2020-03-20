package com.siit.tema3.library;

import java.lang.reflect.Array;

public class Novel extends Book {

   private int type;

       public Novel(String name, int amount, int pageNumbers, int yearOfRelease, int type) {
        super(name, amount, pageNumbers, yearOfRelease);
        this.type=type;
    }
   public void addNovel (Array Books) {

   }

}

