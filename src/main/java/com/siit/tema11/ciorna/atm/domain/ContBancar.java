package com.siit.tema11.ciorna.atm.domain;

import java.math.BigDecimal;

public class ContBancar {
    private String nriBAN;
    private BigDecimal balanta;

    public ContBancar(String nriBAN, BigDecimal balanta) {
        this.nriBAN = nriBAN;
        this.balanta = balanta;
    }

    public String getNriBAN() {
        return nriBAN;
    }

    public BigDecimal getBalanta() {
        return balanta;
    }

    public void setBalanta(BigDecimal balanta) {
        this.balanta = balanta;
    }
}
