package com.siit.tema3.ciorna.library2;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode

public class Album extends Book {
    private String paperQuality;

    public Album() {
        this("Album Unknown", -1, "Unknown Quality");
    }

    public Album(String name, int pageNumbers, String paperQuality) {
        super(name, pageNumbers);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }
}
