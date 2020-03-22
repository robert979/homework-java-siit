package com.siit.tema3.bank2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Card extends BankAccount {
    private long cardNumber;
    private int expirationDate;

    public Card(String name, String cnp, String iban, double ballance, long cardNumber, int expirationDate) {
        super(name, cnp, iban, ballance);
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }
    private static void main(String[] args) {
        Card card1 = new Card("Miha Ionescu", "1810315056019", "RO6912345", 0.0, 123456789123456789L, 20220216);
        Card card2 = new Card("Vasile Georgescu", "1810315056018", "RO5571235",0.0,123456789123456789L, 20230124);
        Card card3 = new Card ("Dobrin Nicolae", "1810315056018", "RO6677895", 0.0,123456789123456789L, 20210721);
    }
}
