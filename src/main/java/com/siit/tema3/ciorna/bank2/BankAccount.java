package com.siit.tema3.ciorna.bank2;

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
    public void  add (double addMoney ){

        this.ballance+=addMoney;
        System.out.println("Domnule " + getName() +"\nSuma de " + addMoney + " de  lei a fost debitata in contul dumneavoastra si acum aveti in cont " + this.ballance + " de lei" );
    }
    public void remove (double removeMoney) {
        if (ballance >= removeMoney) {
            this.ballance -= removeMoney;
            String str = String.format("%.02f", ballance);
            System.out.println("Domnule " + getName() + "\nSuma de " + removeMoney + " lei a fost eliberata in numerar.\n Mai aveti in cont " + str+ " de lei");
        }
        else {
            //String str = String.format("%.02f", ballance);  //merge asa :)
            System.out.println("Domnule " + getName() + "\nSuma nu a fost retrasa, fonduri insuficiente, mai aveti in cont " + getBallance() + " de lei");
        }
    }

}

