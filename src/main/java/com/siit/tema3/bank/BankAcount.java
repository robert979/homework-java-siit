package com.siit.tema3.bank;

public class BankAcount extends User {

    private double balance;

    public BankAcount(String name, String iban, double balance) {
        super(name, iban);
        this.balance=balance;
        }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    /*public void withdraw (double withdrawModey){
        this.balance=-withdrawModey;
        if (this.balance>= withdrawModey){

     */
        }

