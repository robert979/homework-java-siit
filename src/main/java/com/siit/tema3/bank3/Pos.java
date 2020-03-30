package com.siit.tema3.bank3;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Pos extends Card {
    public Pos(String name, String CNP, String IBAN, BigDecimal ballance, int expirationDate, String cardNumber) {
        super(name, CNP, IBAN, ballance, expirationDate, cardNumber);
    }

    public static void main (String [] args) {

        ArrayList<User> userList = new ArrayList<User>();
        ArrayList<BankAcount> bankAccountList = new ArrayList<BankAcount>();
        ArrayList<Card> cardList = new ArrayList<Card>();


        Card card1= new Card(bankAccountList.get(0).getName(), bankAccountList.get(0).getCNP(),bankAccountList.get(0).getIBAN(),bankAccountList.get(0).getBallance(), 20200602,"12345678");
        cardList.add(card1);
        Card card2= new Card(bankAccountList.get(1).getName(), bankAccountList.get(1).getCNP(),bankAccountList.get(1).getIBAN(),bankAccountList.get(1).getBallance(), 20210602,"12345679");
        cardList.add(card2);

        BankAcount acount1 = new BankAcount(userList.get(0).getName(),userList.get(0).getCNP(), "RO285656", (BigDecimal.valueOf(0)));
        bankAccountList.add(acount1);
        BankAcount acount2 = new BankAcount(userList.get(0).getName(), userList.get(0).getCNP(), "RO285657",BigDecimal.valueOf(0));
        bankAccountList.add(acount2);
        BankAcount acount3 = new BankAcount(userList.get(1).getName(), userList.get(0).getCNP(), "RO285658", BigDecimal.valueOf(100));
        bankAccountList.add(acount3);


        User user1 = new User("Mihai Popescu", "1800101045628" );
        userList.add(user1);
        User user2 = new User("Virgil Goergescu", "180010108562");
        userList.add(user2);


    }

}
