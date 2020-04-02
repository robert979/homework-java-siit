package com.siit.tema3.bank3;

import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.ArrayList;
@EqualsAndHashCode

public class Pos extends Card {
    int expirationDate=getExpirationDate();


    public Pos(String name, String CNP, String IBAN, BigDecimal ballance, int expirationDate, String cardNumber) {
        super(name, CNP, IBAN, ballance, expirationDate, cardNumber);


    }


    public static void main(String[] args) {

        ArrayList<User> userList = new ArrayList<User>();
        ArrayList<BankAcount> bankAccountList = new ArrayList<BankAcount>();
        ArrayList<Card> cardList = new ArrayList<Card>();


        User user1 = new User("Mihai Popescu", "1800101045628");
        userList.add(user1);
        User user2 = new User("Virgil Georgescu", "180010108562");
        userList.add(user2);

        BankAcount acount1 = new BankAcount(userList.get(0).getName(), userList.get(0).getCNP(), "RO285656", (BigDecimal.valueOf(100)));
        bankAccountList.add(acount1);
        BankAcount acount2 = new BankAcount(userList.get(0).getName(), userList.get(0).getCNP(), "RO285657", BigDecimal.valueOf(0));
        bankAccountList.add(acount2);
        BankAcount acount3 = new BankAcount(userList.get(1).getName(), userList.get(0).getCNP(), "RO285658", BigDecimal.valueOf(100));
        bankAccountList.add(acount3);

        Card card1 = new Card(bankAccountList.get(0).getName(), bankAccountList.get(0).getCNP(), bankAccountList.get(0).getIBAN(), bankAccountList.get(0).getBallance(), 20200602, "12345678");
        cardList.add(card1);

        Card card2 = new Card(bankAccountList.get(1).getName(), bankAccountList.get(1).getCNP(), bankAccountList.get(1).getIBAN(), bankAccountList.get(1).getBallance(), 20210602, "12345679");
        cardList.add(card2);
        Card card3 = new Card(bankAccountList.get(2).getName(), bankAccountList.get(1).getCNP(), bankAccountList.get(1).getIBAN(), bankAccountList.get(2).getBallance(), 20210601, "12345680");
        cardList.add(card3);

        Card card4 = new Card(bankAccountList.get(2).getName(), bankAccountList.get(1).getCNP(), bankAccountList.get(1).getIBAN(), bankAccountList.get(2).getBallance(), 20220601, "12345681");
        cardList.add(card4);
        Card card5 = new Card(bankAccountList.get(2).getName(), bankAccountList.get(1).getCNP(), bankAccountList.get(1).getIBAN(), bankAccountList.get(2).getBallance(), 20190601, "12345681");
        cardList.add(card5);

        Card card6 = new Card("Alexandru Stan", "1809096546454", "RO686978", BigDecimal.valueOf(90), 20220314, "12345699");
        cardList.add(card6);


        int l = cardList.size();
        System.out.println(l);


        for (int i = 0; i <= l - 1; i++) {
            System.out.println("Domnul " + cardList.get(i).getName() + " al carui CNP este " + cardList.get(i).getCNP() + " mai are in cont " + cardList.get(i).getBallance() + " Lei");
        }


        card1.withdraw(BigDecimal.valueOf(50));
        card1.withdraw(BigDecimal.valueOf(10));
        card3.withdraw(BigDecimal.valueOf(60));
        card3.withdraw(BigDecimal.valueOf(10));
        card2.withdraw(BigDecimal.valueOf(4));
        card1.withdraw(BigDecimal.valueOf(4));
        card1.withdraw(BigDecimal.valueOf(20));
        card5.withdraw(BigDecimal.valueOf(10));
        card5.deposit(BigDecimal.valueOf(10));
        card6.withdraw(BigDecimal.valueOf(10));
        card6.deposit(BigDecimal.valueOf(10));
        card1.deposit(BigDecimal.valueOf(50));card1.deposit(BigDecimal.valueOf(10000));


    }


}








