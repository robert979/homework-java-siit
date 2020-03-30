package com.siit.tema3.bank3;

import com.siit.tema3.bank2.BankAccount;

import javax.sound.midi.Soundbank;
import java.lang.annotation.ElementType;
import java.math.BigDecimal;
import java.security.PublicKey;

public class BankAcount extends User {

    private String IBAN;
    private BigDecimal ballance;


    public BankAcount(String name, String CNP, String IBAN, BigDecimal ballance) {
        super(name, CNP);
        this.IBAN = IBAN;
        this.ballance = ballance;
    }

    public static boolean checkIBAN(String IBAN) {
        boolean ibanChekc = false;
        String[] ibanList = {
                "RO285656",
                "RO285657",
                "RO285658"
        };
        int lIbanList = ibanList.length;
        for (int i = 0; i < lIbanList - 1; i++) {
            if (ibanList[i].equals(IBAN)) {
                ibanChekc = true;
                break;
            } else {
                ibanChekc = false;
            }
        }

        return ibanChekc;

    }

    public String getIBAN() {
        return IBAN;

    }

    public BigDecimal getBallance() {
        return ballance;
    }

    public void withdrawOperation(BigDecimal moneyAmount) {
        if (moneyAmount.compareTo(ballance) < 0) {
            if ((moneyAmount.remainder(BigDecimal.valueOf(5))).compareTo(BigDecimal.valueOf(0)) == 0) {
                if (checkIBAN(getIBAN())) {
                    System.out.println("Domnule " + getName() + " cererea dumneavoastra de a retrage suma de " + moneyAmount + " de LEI a fost procesata\nsold nou :" + ballance.subtract(moneyAmount) + " LEI");
                    ballance = ballance.subtract(moneyAmount);

                } else {
                    System.out.println("IBAN Incorect - cererea dumneavoastra de a retrage bani, nu a putut fi procesata");
                }
            } else {
                System.out.println("Domnule " + getName() + " cererea dumneavoastra nu a fost procesata\nSuma introdusa trebuie sa fie multiplu de 5");
            }
        } else {
            System.out.println("Fonduri insuficiente - cererea nu a putut fi procesata");
        }
    }

    public void depositOperation(BigDecimal moneyAmount) {
        if (checkIBAN(getIBAN())) {
            System.out.println("Domnule " + getName() + " contul dumneavoastra a fost alimentat cu suma de " + moneyAmount + " de LEI\nsold nou :" + ballance.add(moneyAmount) + " LEI");
            ballance = ballance.add(moneyAmount);
        } else {
            System.out.println("IBAN Incorect - cererea dumneavoastra de a alimenta contul cu bani, nu a putut fi procesata");

        }


    }
}
