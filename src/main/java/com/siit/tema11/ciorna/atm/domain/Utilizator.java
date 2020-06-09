package com.siit.tema11.ciorna.atm.domain;

import java.math.BigDecimal;

public class Utilizator extends ContBancar {
    private String numeUtilizator;
    private String cnp;

    public Utilizator(String nriBAN, BigDecimal balanta, String numeUtilizator, String cnp) {
        super(nriBAN, balanta);
        this.numeUtilizator = numeUtilizator;
        this.cnp = cnp;
    }
}
