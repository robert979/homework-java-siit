package com.siit.tema3.library2;

public class Books {
    private String name;
    private int pageNumbers;

    public Books(String name, int pageNumbers) {
        this.name = name;
        this.pageNumbers = pageNumbers;
    }

    public Books(){
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
