package com.siit.tema3.bank2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter



public class BankAccount extends User {
    private String iban;
    private double ballance;

    public BankAccount(String name, String cnp, String iban, double ballance) {
        super(name, cnp);
        this.iban = iban;
        this.ballance = ballance;
    }
}

