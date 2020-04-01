//interogateBallance
//printAllUsers
//changePinWithOldPin
//printPinByCardNumber
//withdrawByNameAndPin
//printAllCardsDetails

package com.siit.tema4.atm;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ATM {

    public static void main (String ... args){
        ArrayList<User> usersList = new ArrayList<User>();
        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();
        ArrayList<Card> cards = new ArrayList<Card>();

        User user1 = new User("Mihai Ionescu", "180252526");
        usersList.add(user1);
        User user2 = new User("Virgil Popescu","180252527");
        usersList.add(user2);

        BankAccount account1 = new BankAccount(usersList.get(0).getUserName(), usersList.get(0).getCnp(), "123456", BigDecimal.valueOf(0)) ;
        bankAccounts.add(account1);

        Card card1 = new Card(bankAccounts.get(0).getUserName(), bankAccounts.get(0).getCnp(),bankAccounts.get(0).getIban(),bankAccounts.get(0).getBallance(), 1234,"1234567890");
        cards.add(card1);

        card1.interogateBallance(cards, 0);
        printAllUsers(usersList);
        System.out.println();

        User user3 = new User("Jhon McEnroe", "180252528");
        usersList.add(user3);
        printAllUsers(usersList);
        System.out.println();

        printAllUsersWithBankAccount(usersList, bankAccounts);
        BankAccount bankAccount2 = new BankAccount(usersList.get(0).getUserName(), usersList.get(0).getCnp(),"123457",BigDecimal.valueOf(1000.00));
        System.out.println();

        printPinByCardNumber(cards, "1234567890");
        System.out.println();

        changePinWithOldPin(cards, "1234567890",1234,5678);

        printPinByCardNumber(cards, "1234567890");
        System.out.println();

        card1.withdrawByNameAndPin(cards, "Mihai Ionescu", "1234567890",1234, 50);
        System.out.println();

        card1.withdrawByNameAndPin(cards, "Mihai Ionescu","1234567890", 5678, 50);

        Card card2 =new Card(bankAccount2.getUserName(), bankAccount2.getCnp(), bankAccount2.getIban(), bankAccount2.getBallance(), 4321, "1234567891");
        card2.withdrawByNameAndPin(cards, "Mihai Ionescu", "1234567891",4321, 100);
        System.out.println();
        card2.withdrawByNameAndPin(cards, "Virgil Popescu","1234567891", 5678, 100);
        cards.add(card2);

        printAllCardsDetails(cards);




    }
    private static void printAllCardsDetails(ArrayList<Card> cards){
        for (int i=0;  i<=cards.size()-1;i++){
            System.out.println("User " + cards.get(i).getUserName() + " si are numar de card: " + cards.get(i).getCardNumber() +" si are IBAN: " + cards.get(i).getIban() + " si mai are in cont " + cards.get(i).getBallance() + " de LEI");
        }
    }


    private static void printAllUsers (ArrayList<User> usersList){
        for (int i=0; i<=usersList.size()-1; i++){
            System.out.println("User " + (i+1) +" has the Name: " +  usersList.get(i).getUserName() + " and his ID is " + i );
        }
    }
    public static void printAllUsersWithBankAccount (ArrayList<User> usersList, ArrayList<BankAccount> bankAccounts){
        for (int i=0; i <=usersList.size()-1; i++){
            for (int j=0; j<=bankAccounts.size()-1; j++){

            if (usersList.get(i).getUserName().equals(bankAccounts.get(j).getUserName())){
                System.out.println("User " + usersList.get(i).getUserName() + " are un cont bancar, si acesta este " + bankAccounts.get(j).getIban() + " si are account id " + j);
            }
        }
        }
    }
    public static void changePinWithOldPin (ArrayList<Card> cards, String cardNumber, int pin_vechi, int pin_nou){
        for (int i=0; i<=cards.size()-1;i++){
            if (cards.get(i).getCardNumber().equals(cardNumber) ){
                if (cards.get(i).getPin() == pin_vechi){
                    cards.get(i).setPin(pin_nou);
                }
                else {
                    System.out.println("Pin-ul introdus este incorect. Pin-ul nu a fost schimbat");
                }
            }
            else {
                System.out.println("Numar de card inexistent, operatiunea nu a fost initiata");
            }
        }
    }
    public static void printPinByCardNumber (ArrayList<Card> cards, String cardNumber){
        for (int i =0; i<=cards.size()-1;i++){
            if (cardNumber.equals(cards.get(i).getCardNumber())){
                System.out.println("Domnule " + cards.get(i).getUserName() + " PIN-ul d-voastra este " + cards.get(i).getPin());
            }
        }
    }

}
