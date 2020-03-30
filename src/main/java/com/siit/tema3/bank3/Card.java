package com.siit.tema3.bank3;

import java.math.BigDecimal;

public class Card extends BankAcount {
    private int expirationDate;
    private String cardNumber;

    public Card(String name, String CNP, String IBAN, BigDecimal ballance, int expirationDate, String cardNumber) {
        super(name, CNP, IBAN, ballance);
        this.expirationDate = expirationDate;
        this.cardNumber = cardNumber;
    }
    public int getExpirationDate (){
        return expirationDate;
    }
    public String getCardNumber (){
        return cardNumber;
    }


}
