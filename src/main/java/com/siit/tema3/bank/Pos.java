package com.siit.tema3.bank;

public class Pos extends Card {

    public Pos(String name, String iban, double balance, String cardNumber, int expirationDate) {
        super(name, iban, balance, cardNumber, expirationDate);





    }
    public static void main (String ... args){
        Card card001 = new Card(" Ion Popescu", "RO20ING844845",1000.00 , " 12345678910212", 20231207);
        card001.withdraw(100.00);
        card001.withdraw(1000.00);

        Card card002 = new Card("Mihai Ionescu", "RO44847421212", 00.00, "129959859584", 20191207);
        card002.withdraw(00.00);

        Card card003 = new Card("Virgil Marinescu", "RO458789", 60.00, "12459884848", 20230606);
        card003.withdraw(45.00);

    }
}
