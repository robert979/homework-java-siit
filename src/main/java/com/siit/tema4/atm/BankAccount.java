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

    /*
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
    */
    public  void depositB (ArrayList<BankAccount> bankAccounts,String IBAN, int depositAmount) {
        for (int i = 0; i <= bankAccounts.size() - 1; i++) {
            if (IBAN.equals(bankAccounts.get(i).getIban())) {
                bankAccounts.get(i).setBallance(BigDecimal.valueOf(bankAccounts.get(i).getBallance().intValue() + depositAmount));
                System.out.println("Domnule " + bankAccounts.get(i).getUserName() + " suma de " + depositAmount + " a fost debitata in contul dumneavoastra\nsoldul este " +
                        bankAccounts.get(i).getBallance() + " de LEI");
            }
        }
    }
    public  void withdrawByCardb (ArrayList<Card> cards, String cardNumber, int pin, int amount){
        int count=0;
        for (int i=0; i<=cards.size()-1; i++){
            if (cards.get(i).getCardNumber().equals(cardNumber)){
                count=count+1;
                if(cards.get(i).getPin() == pin){
                    if (cards.get(i).getBallance().intValue() >= amount){
                        cards.get(i).setBallance(BigDecimal.valueOf((cards.get(i).getBallance().intValue() - amount)));
                        System.out.println("Domnule " + cards.get(i).getUserName() + " suma de " + amount + " a fost retrasa din contul dumneavoastra.\nMai aveti in cont: " +
                                cards.get(i).getBallance()+ " de LEI --------------------------- IBAN: " + cards.get(i).getIban());
                    }
                    else {
                        System.out.println(("Domnule " + cards.get(i).getUserName() + " fonduri insuficiente"));
                    }
                }
                else {
                    System.out.println("Pin incorect - tranzactia nu a fost initializata");
                }
            }
        }
        if (count ==0){
            System.out.println("Numarul de card " + cardNumber + " nu a fost gasit" );
        }

    }
}


