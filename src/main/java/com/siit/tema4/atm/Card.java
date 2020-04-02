package com.siit.tema4.atm;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Card extends BankAccount {
    private int pin;
    private String cardNumber;

    public Card (String name, String cnp, String iban, BigDecimal ballance, int pin, String cardNumber ){
        super(name, cnp, iban, ballance);
        this.pin=pin;
        this.cardNumber=cardNumber;
    }

    public int getPin(){
        return pin;
    }
    public String getCardNumber (){
        return cardNumber;
    }
    public void setPin (int pin){
        this.pin = pin;
    }
    public void setCardNumber (String cardNumber){
        this.cardNumber=cardNumber;
    }
    public void printCardDetails (ArrayList<Card> cards){


    }
}
