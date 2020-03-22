package com.siit.tema3.bank2;

import lombok.ToString;


@ToString

public class POS extends Card {
    public POS(String name, String cnp, String iban, double ballance, long cardNumber, int expirationDate) {
        super(name, cnp, iban, ballance, cardNumber, expirationDate);
    }
    public static void main (String [] args) {
        //System.out.println(Card.getName());
    }


}
