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


    public int getExpirationDate (){
        return expirationDate;
    }
    public String getCardNumber (){
        return cardNumber;
    }

    public boolean checkExpirationDate (){
        boolean exp = false;
        if (expirationDate>20200330){
            exp = true;

        }
        else {;
            exp = false;
        }
        return exp;
    }
    public  BigDecimal withdraw (BigDecimal sumaDeRetras){
        if ( checkExpirationDate()){
            withdrawOperation(sumaDeRetras);
        }
        else {
            System.out.println("Card expirat - cererea nu a putut fi procesata");
        }

        return sumaDeRetras;
    }


}
