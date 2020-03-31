package com.siit.tema3.ciorna.library2;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode

public class Novel extends Book {
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
