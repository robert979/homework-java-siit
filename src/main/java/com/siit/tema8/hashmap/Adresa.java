package com.siit.tema8.hashmap;

import lombok.Builder;
import lombok.Data;

@Data

public class Adresa {
    private String country;
    private String city;
    private String streetName;
    private int streetNumber;

    @Builder

    public Adresa(String country, String city, String streetName, int streetNumber) {
        this.country = country;
        this.city = city;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }
}
