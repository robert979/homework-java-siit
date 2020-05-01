package com.siit.tema8.hashmap;

import lombok.Builder;
import lombok.Data;

@Data

public class Persoana {
    String name;

    public boolean equals(Object o) {
        return true;
    }


    @Builder

    public Persoana(String name) {
        this.name = name;
    }
}
