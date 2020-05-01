package com.siit.tema8.hashmap;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class Hobby {
    private String hobyName;
    private int frequency;
    private List<Adresa> adresa;


    @Builder
    public Hobby(String hobyName, int frequency, List<Adresa> adresa) {
        this.hobyName = hobyName;
        this.frequency = frequency;
        this.adresa = adresa;
    }
}
