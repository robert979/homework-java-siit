package com.siit.tema3.library2;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode

public class Book {
    private String name;
    private int pageNumbers;

    public Book(String name, int pageNumbers) {
        this.name = name;
        this.pageNumbers = pageNumbers;
    }

    public Book(){
        this("Jon Doe",0);

    }

    public int getPageNumbers (){
        return pageNumbers;
    }
    public void setPageNumbers (int pageNumbers){
        this.pageNumbers=pageNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
