package com.siit.tema3.ciorna.bank2;

public class POS extends Card {
    public POS(String name, String cnp, String iban, double ballance, long cardNumber, int expirationDate) {
        super(name, cnp, iban, ballance, cardNumber, expirationDate);
    }
    public static void main (String [] args) {
        Card card1 = new Card("Mihai Ionescu", "1810315056019", "RO69123459", 0.0, 123456789123456789L, 20220216);
        card1.deposit(785.25);
        card1.deposit(617.88);
        card1.withdraw(600.01);
        card1.withdraw(2000.22);

        Card card2 = new Card("Vasile Georgescu", "18103150560189", "RO69123459",0.0,123456789123456789L, 20230124);
        card2.deposit(55.10D);
        card2.withdraw(50.20D);

        Card card3 = new Card ("Dobrin Nicolae", "1810315056018", "RO6677895", 0.0,123456789123456789L, 20210721);
        card3.deposit(87.5);
        card3.withdraw(65.20);

        Card card4 = new Card("Mihai Arnautu","1810315056019","RO69123459", 0.0, 123456789123456789L, 20200216);
        card4.deposit(16.00);
        card4.withdraw(15.00);


    }


}
