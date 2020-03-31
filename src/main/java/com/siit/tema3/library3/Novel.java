package com.siit.tema3.library3;

public class Novel extends Book {


    private String type;

    public Novel(String newName, int pageNumbers, String type) {
        super(newName, pageNumbers);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
