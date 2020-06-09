package com.siit.tema11.atm.domain;

import java.math.BigDecimal;

public class User extends BankAccount {
    private String userName;
    private String cnp;

    public User(String iban, BigDecimal balance, String userName, String cnp) {
        super(iban, balance);
        this.userName = userName;
        this.cnp = cnp;
    }
}
