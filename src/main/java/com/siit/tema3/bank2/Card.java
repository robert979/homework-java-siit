package com.siit.tema3.bank2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Card extends BankAccount {
    private long cardNumber;
    private int expirationDate;

    public Card(String name, String cnp, String iban, double ballance, long cardNumber, int expirationDate) {
        super(name, cnp, iban, ballance);
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }
}
