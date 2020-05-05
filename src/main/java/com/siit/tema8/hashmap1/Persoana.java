package com.siit.tema8.hashmap1;

import java.util.Objects;

public class Persoana {
    private String name;

    public Persoana(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return Objects.equals(name, persoana.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "name='" + name + '\'' +
                '}';
    }
}
