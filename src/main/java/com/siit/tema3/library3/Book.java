package com.siit.tema3.library3;

public class Book {
    private String newName;
    private int pageNumbers;

    public Book (String newName, int pageNumbers){
        this.newName=newName;
        this.pageNumbers=pageNumbers;
    }

    public String getnewName(){
        return newName;
    }
    public int getPageNumbers (){
        return pageNumbers;
    }

    public void setPageNumbers (int pageNumbers){
        this.pageNumbers=pageNumbers;
    }

    public void setnewName(String newName) {
        this.newName=newName;
    }
}
