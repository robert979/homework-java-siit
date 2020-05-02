package com.siit.tema8.hashmap;

import lombok.Builder;
import lombok.Data;

@Data
public class Persoana {
    String name;

    public boolean equals(Object o) {
        if (o == null || !(o instanceof Persoana)) {
            return false;
        }
        Persoana p = (Persoana) o;
        return this.name.equals(p.name);
    }

    public int hashCode() {
        return name.hashCode();
    }

    @Builder

    public Persoana(String name) {
        this.name = name;
    }
}
