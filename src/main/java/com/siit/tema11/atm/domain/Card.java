package com.siit.tema11.atm.domain;

import java.math.BigDecimal;

public class Card extends User{
    private int pin;
    private String cardNumber;

    public Card(String iban, BigDecimal balance, String userName, String cnp, int pin, String cardNumber) {
        super(iban, balance, userName, cnp);
        this.pin = pin;
        this.cardNumber = cardNumber;
    }
}
