package com.siit.tema3.library3;

public class Album extends Book {
    private String paperQuality;

    public Album (String newName, int pageNumbers, String paperQuality){
        super(newName, pageNumbers);
        this.paperQuality=paperQuality;
    }

    public String getPaperQuality(){
        return paperQuality;
    }
    public void setPaperQuality(String paperQuality){
        this.paperQuality=paperQuality;
    }

}
