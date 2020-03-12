package com.siit.tema3.bank;

public class User {
    private String name;
    private String iban;



    public User(String name, String iban) {
        this.name = name;
        this.iban = iban;
        }

    public String getName() {
        return name;
    }

    public String getIban() {
        return iban;
    }
}
