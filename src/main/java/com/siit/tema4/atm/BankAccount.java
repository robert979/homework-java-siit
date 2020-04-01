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
    public void interogateBallance (ArrayList<Card> cards, int i){
        System.out.println(cards.get(i).getBallance());

    }


    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public BigDecimal getBallance() {
        return ballance;
    }

    public void setBallance(BigDecimal ballance) {
        this.ballance = ballance;
    }

}
