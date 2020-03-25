package com.siit.tema3.bank2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

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
    public void withdraw (double withdrawMoney) {

            if (getExpirationDate() >=20200323){
                if(getIban().length()==10){
                    remove(withdrawMoney);

                }
                else {
                   System.out.println("Domnule " + getName() + "\nSuma nu a fost retrasa, cont IBAN incorect");
                                  }
            }
            else {
                System.out.println( "Domnule " + getName() +"\nSuma nu a fost retrasa, card expirat");
                  }

    }
    public void deposit (double depositMoney){
        if (getExpirationDate() >=20200323){
            if(getIban().length()==10){
                add(depositMoney);

            }
            else {
                System.out.println("Domnule " + getName() + "\nSuma nu a fost depusa, cont IBAN incorect");
            }
        }
        else {
            System.out.println("Domnule " + getName() +"\nSuma nu a fost depusa, card expirat");
        }

    }

    }

