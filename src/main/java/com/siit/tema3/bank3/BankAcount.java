package com.siit.tema3.bank3;

import com.siit.tema3.bank2.BankAccount;

import java.math.BigDecimal;

public class BankAcount extends User {

    private String IBAN;
    private BigDecimal ballance;

    public BankAcount(String name, String CNP, String IBAN, BigDecimal ballance) {
        super(name, CNP);
        this.IBAN = IBAN;
        this.ballance=ballance;
    }

    public String getIBAN (){
        return IBAN;

    }
    public BigDecimal getBallance (){
        return ballance;
    }

}
