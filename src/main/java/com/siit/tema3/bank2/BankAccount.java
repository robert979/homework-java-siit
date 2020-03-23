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
    public void  deposit (double depositMoney ){

        this.ballance+=depositMoney;
        System.out.println("suma de " + depositMoney + " de  lei a fost debitata in contul dumneavoastra si acum aveti in cont " + this.ballance + " de lei" );
    }
    public void withdraw (double withdrawMoney) {
        if (ballance >= withdrawMoney) {
            this.ballance -= withdrawMoney;
            System.out.println("Domnule " + getName() + "\nSuma de " + withdrawMoney + " lei a fost eliberata in numerar.\n Mai aveti in cont " + ballance + " de lei");
        }
        else {
            System.out.println("Domnule " + getName() + "\n Suma nu a fost retrasa, fonduri insuficiente, mai aveti in cont " + getBallance() + " de lei");
        }
    }

}

