package com.siit.tema3.bank;

public class Pos extends Card {

    public Pos(String name, String iban, double balance, String cardNumber, int expirationDate) {
        super(name, iban, balance, cardNumber, expirationDate);
        Card card001 = new Card(" Ion Popescu", "RO20ING84484",1000.00 , " 12345678910212", 20231207);
        card001.withdraw(100.00);


        }







}
