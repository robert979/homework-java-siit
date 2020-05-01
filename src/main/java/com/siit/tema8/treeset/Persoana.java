package com.siit.tema8.treeset;

import lombok.ToString;

@ToString
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Persoana {
    private String nume;
    //@EqualsAndHashCode.Include
    private int varsta;


    public Persoana(String nume, int varsta) {
        this.varsta = varsta;
        this.nume = nume;


    }


    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }
}
