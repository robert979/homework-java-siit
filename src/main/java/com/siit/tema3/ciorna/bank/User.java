package com.siit.tema3.ciorna.bank;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
