package com.siit.tema11.atm.domain;

import com.siit.tema11.atm.repository.AccountRepository;

import java.math.BigDecimal;
import static com.siit.tema11.atm.repository.AccountRepository.*;

public class BankAccount {
    private String iban;
    private BigDecimal balance;

    public BankAccount(String iban, BigDecimal balance) {
        this.iban = iban;
        this.balance = balance;
    }



    public String getIban() {
        return iban;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }



}
