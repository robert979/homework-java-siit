package com.siit.tema3.library2;

public class Novel extends Books {
    private String type;

    public Novel(){
        this("Novel Unknwon", -1, "Unknown Type");
    }

    public Novel (String name, int pageNumbers, String type){
        super(name, pageNumbers);
        this.type=type;

    }

    public void setType (String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
}
