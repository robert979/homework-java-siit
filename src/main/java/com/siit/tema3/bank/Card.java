package com.siit.tema3.bank;

public class Card extends BankAcount {

    private String cardNumber;
    private int expirationDate;

    public Card(String name, String iban, int balance, String cardNumber, int expirationDate) {
        super(name, iban, balance);
        this.cardNumber=cardNumber;
        this.expirationDate=expirationDate;

    }
}
