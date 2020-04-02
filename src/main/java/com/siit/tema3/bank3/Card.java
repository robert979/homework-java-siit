package com.siit.tema3.bank3;

import javax.sound.midi.Soundbank;
import java.math.BigDecimal;

public class Card extends BankAcount {
    private int expirationDate;
    private String cardNumber;

    public Card(String name, String CNP, String IBAN, BigDecimal ballance, int expirationDate, String cardNumber) {
        super(name, CNP, IBAN, ballance);
        this.expirationDate = expirationDate;
        this.cardNumber = cardNumber;
    }


    public int getExpirationDate() {
        return expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public boolean checkExpirationDate() {
        boolean exp = false;
        if (expirationDate > 20200330) {
            exp = true;

        } else {
            ;
            exp = false;
        }
        return exp;
    }

    public BigDecimal withdraw(BigDecimal withdrawAmount) {
        if (checkExpirationDate()) {
            atmwithdrawOperation(withdrawAmount);
        } else {
            System.out.println("Card expirat - cererea dumneavoastra de a retrage bani, nu a putut fi procesata");
        }

        return withdrawAmount;
    }

    public BigDecimal deposit(BigDecimal depositAmount) {
        if (checkExpirationDate()) {
            depositOperation(depositAmount);


        } else {
            System.out.println("Card expirat - cererea dumneavoastra de a alimenta contul cu bani, nu a putut fi procesata");
        }

        return depositAmount;
    }


}
