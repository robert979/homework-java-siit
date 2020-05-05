package com.siit.tema8.hashmap1;


import java.util.List;


public class Hobby {
    private String hobby;
    private int frequency;
    private List<Adresa> adresa;

    public Hobby(String hobby, int frequency, List<Adresa> adresa) {
        this.hobby = hobby;
        this.frequency = frequency;
        this.adresa = adresa;
    }


    @Override
    public String toString() {
        return "Hobby{" +
                "hobby='" + hobby + '\'' +
                ", frequency=" + frequency +
                ", adresa=" + adresa +
                '}';
    }
}
