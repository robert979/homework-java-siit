package com.siit.tema8.hashmap;

import lombok.Builder;

public class Persoana {
    String name;

    @Builder

    public Persoana(String name) {
        this.name = name;
    }
}
