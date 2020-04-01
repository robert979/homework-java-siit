package com.siit.tema4.atm;

import java.math.BigDecimal;
import java.util.ArrayList;

public class BankAccount extends User {


    private String iban;
    private BigDecimal ballance;

    public BankAccount(String name, String cnp, String iban, BigDecimal ballance) {
        super(name, cnp);
        this.iban = iban;
        this.ballance = ballance;
    }

    public void interogateBallance(ArrayList<Card> cards, int i) {
        System.out.println(cards.get(i).getBallance());

    }


    public String getIban() {
        return iban;
    }

    public BigDecimal getBallance() {
        return ballance;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setBallance(BigDecimal ballance) {
        this.ballance = ballance;
    }

    public void withdrawByNameAndPin(ArrayList<Card> cards, String cardNumber, String userName, int pin, int withdrawlAmout) {
        for (int i = 0; i <= cards.size() - 1; i++) {
            if (cards.get(i).getUserName().equals(userName)) {
                if (cards.get(i).getCardNumber().equals(cardNumber)) {
                    if (cards.get(i).getPin() == pin) {
                        if (cards.get(i).getBallance().intValue() >= withdrawlAmout) {
                            cards.get(i).setBallance(ballance.subtract(BigDecimal.valueOf(withdrawlAmout)));
                            System.out.println("Noul dumneavoastra sold este de" + cards.get(i).getBallance() + " de LEI");


                        } else {
                            System.out.println("Fonduri insuficeinte, suma nu a fost retrasa");
                        }
                    } else {
                        System.out.println("Pin incorect, operatia nu a fost intializata");
                    }
                } else {
                    System.out.println("Numar card invalid, operatia nu a fost initializata");
                }
            } else {
                System.out.println("Utilizator necunoscut");
            }
        }

    }
}


