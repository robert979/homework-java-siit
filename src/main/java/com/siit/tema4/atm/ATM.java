//interogateBallance
//printAllUsers
//changePinWithOldPin
//printPinByCardNumber
//withdrawByNameAndPin - by object call
//printAllCardsDetails
//withdrawByCard


package com.siit.tema4.atm;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ATM {

    public static void main(String... args) {
        ArrayList<User> usersList = new ArrayList<User>();
        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
        ArrayList<Card> cards = new ArrayList<Card>();

        User user1 = new User("Mihai Ionescu", "180252526");
        usersList.add(user1);
        User user2 = new User("Virgil Popescu", "180252527");
        usersList.add(user2);
        User user3 = new User("Jhon McEnroe", "180252528");
        usersList.add(user3);

        BankAccount account1 = new BankAccount(usersList.get(0).getUserName(), usersList.get(0).getCnp(), "123456", BigDecimal.valueOf(0));
        bankAccounts.add(account1);

        BankAccount bankAccount2 = new BankAccount(usersList.get(0).getUserName(), usersList.get(0).getCnp(), "123457", BigDecimal.valueOf(1000.00));
        bankAccounts.add(bankAccount2);
        System.out.println();
        Card card1 = new Card(bankAccounts.get(0).getUserName(), bankAccounts.get(0).getCnp(), bankAccounts.get(0).getIban(), bankAccounts.get(0).getBallance(), 1234, "1234567890");
        cards.add(card1);


        printAllUsers(usersList);
        System.out.println();


        printPinByCardNumber(cards, "1234567890");
        System.out.println();

        changePinWithOldPin(cards, "1234567890", 1234, 5678);

        printPinByCardNumber(cards, "1234567890");
        System.out.println();


        Card card2 = new Card(bankAccount2.getUserName(), bankAccount2.getCnp(), bankAccount2.getIban(), bankAccount2.getBallance(), 4321, "1234567891");
        cards.add(card2);
        System.out.println("card2 pin:" + card2.getPin() + " sold: " + card2.getBallance() + " card number " + card2.getCardNumber());

        Card card3 = new Card(bankAccounts.get(1).getUserName(), bankAccounts.get(1).getCnp(), bankAccounts.get(1).getIban(), bankAccounts.get(1).getBallance(), 7788, "1234567892");
        cards.add(card3);
        printAllBankAccounts(bankAccounts);


        printAllCardsDetails(cards);

        interogateBallance(bankAccounts, "123457");
        System.out.println("card3 sold " + cards.get(2).getBallance() + " de LEI IBAN: " + cards.get(2).getIban());
        System.out.println("card3 sold " + cards.get(1).getBallance() + " de LEI IBAN: " + cards.get(1).getIban());


        printAllCardsDetails(cards);
        card1.withdrawByCardb(cards, "1234567891", 4321, 250);
        printAllCardsDetails(cards);
        printAllBankAccounts(bankAccounts);
        WithdrawByBankAccount(cards, bankAccounts, "1234567892", 7788, 250);
        WithdrawByBankAccount(cards, bankAccounts, "1234567892", 7788, 900);
        WithdrawByBankAccount(cards, bankAccounts, "1234567891", 4321, 250);
        bankAccount2.depositB(bankAccounts, "123457", 1500);
        WithdrawByBankAccount(cards, bankAccounts, "1234567891", 4321, 500);
        WithdrawByBankAccount(cards, bankAccounts, "1234567891", 4321, 1235);
        interogateBallance(bankAccounts, "123457");
        printAllBankAccounts(bankAccounts);
        deposit(bankAccounts, "123457", 555);
        printAllCardsDetails(cards);



    }


    private static void WithdrawByBankAccount(ArrayList<Card> cards, ArrayList<BankAccount> bankAccounts, String cardNumber, int pin, int withdrawAmount) {
        for (int i = 0; i <= cards.size() - 1; i++) {
            if (cardNumber.equals(cards.get(i).getCardNumber()) && cards.get(i).getPin() == pin) {
                for (int j = 0; j <= bankAccounts.size() - 1; j++) {
                    if (bankAccounts.get(j).getIban().equals(cards.get(i).getIban())) {

                        if (bankAccounts.get(j).getBallance().intValue() >= withdrawAmount) {
                            bankAccounts.get(j).setBallance(BigDecimal.valueOf(bankAccounts.get(j).getBallance().intValue() - withdrawAmount));

                            System.out.println("Domnule " + cards.get(i).getUserName() + " suma de " + withdrawAmount + " de lei, a fost retrasa din contul dumneavoastra" +
                                    "\nIn acest moment mai aveti in cont " + bankAccounts.get(j).getBallance() + " de LEI");

                        } else {
                            System.out.println("Domnule " + cards.get(i).getUserName() + " suma nu poate retrasa - FONDURI INSUFICIENTE !!");
                        }
                    }
                }

            }
        }
    }

    private static void deposit(ArrayList<BankAccount> bankAccounts, String IBAN, int depositAmount) {
        for (int i = 0; i <= bankAccounts.size() - 1; i++) {
            if (IBAN.equals(bankAccounts.get(i).getIban())) {
                bankAccounts.get(i).setBallance(BigDecimal.valueOf(bankAccounts.get(i).getBallance().intValue() + depositAmount));
                System.out.println("Domnule " + bankAccounts.get(i).getUserName() + " suma de " + depositAmount + " a fost debitata in contul dumneavoastra\nsoldul este " +
                        bankAccounts.get(i).getBallance() + " de LEI");
            }
        }

    }

    private static void interogateBallance(ArrayList<BankAccount> bankAccounts, String IBAN) {
        int count = 0;
        for (int i = 0; i <= bankAccounts.size() - 1; i++) {
            if (IBAN.equals(bankAccounts.get(i).getIban())) {
                System.out.println("Domnule " + bankAccounts.get(i).getUserName() + " soldul dumneavoastra este de " + bankAccounts.get(i).getBallance() + " de LEI");
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("Contul IBAN " + IBAN + " este incorect");
        }
    }


    private static void printAllBankAccounts(ArrayList<BankAccount> bankAccounts) {
        System.out.println("In acest moment sunt active " + bankAccounts.size() + " conturi bancare");
        for (int i = 0; i <= bankAccounts.size() - 1; i++) {
            System.out.println("User: " + bankAccounts.get(i).getUserName() + " IBAN " + bankAccounts.get(i).getIban() + " Sold: " + bankAccounts.get(i).getBallance());

        }
    }

    private static void printAllCardsDetails(ArrayList<Card> cards) {
        System.out.println("Toate cardurile din baza de date sunt: ");
        for (int i = 0; i <= cards.size() - 1; i++) {
            System.out.println("User " + cards.get(i).getUserName() + " si are numar de card: " + cards.get(i).getCardNumber() + ", PIN = " + cards.get(i).getPin() + " si are IBAN: " + cards.get(i).getIban() );
        }
    }


    private static void printAllUsers(ArrayList<User> usersList) {
        for (int i = 0; i <= usersList.size() - 1; i++) {
            System.out.println("User " + (i + 1) + " has the Name: " + usersList.get(i).getUserName() + " and his ID is " + i);
        }
    }


    public static void changePinWithOldPin(ArrayList<Card> cards, String cardNumber, int pin_vechi, int pin_nou) {
        for (int i = 0; i <= cards.size() - 1; i++) {
            if (cards.get(i).getCardNumber().equals(cardNumber)) {
                if (cards.get(i).getPin() == pin_vechi) {
                    cards.get(i).setPin(pin_nou);
                    System.out.println("Domnule " + cards.get(i).getUserName() + " noul dumneavoastra pin pentru cardul " + cards.get(i).getCardNumber() + " este: " + cards.get(i).getPin());
                } else {
                    System.out.println("Pin-ul introdus este incorect. Pin-ul nu a fost schimbat");
                }
            } else {
                System.out.println("Numar de card inexistent, operatiunea nu a fost initiata");
            }
        }
    }

    public static void printPinByCardNumber(ArrayList<Card> cards, String cardNumber) {
        for (int i = 0; i <= cards.size() - 1; i++) {
            if (cardNumber.equals(cards.get(i).getCardNumber())) {
                System.out.println("Domnule " + cards.get(i).getUserName() + " PIN-ul d-voastra este " + cards.get(i).getPin());
            }
        }
    }

}
