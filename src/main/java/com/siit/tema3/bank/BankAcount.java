package com.siit.tema3.bank;

public class BankAcount extends User {

    private int balance;

    public BankAcount(String name, String iban, int balance) {
        super(name, iban);
        this.balance=balance;

    }
}
