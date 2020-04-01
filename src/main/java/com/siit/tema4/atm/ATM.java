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
        User user2 = new User("virgil Popescu","180252527");
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

        printAllUsersWithBankAccount(usersList, bankAccounts);


    }
    private static void printAllUsers (ArrayList<User> usersList){
        for (int i=0; i<=usersList.size()-1; i++){
            System.out.println("User " + (i+1) +" has the Name: " +  usersList.get(i).getUserName() + " and his ID is " + i );
        }
    }
    public static void printAllUsersWithBankAccount (ArrayList<User> usersList, ArrayList<BankAccount> bankAccounts){
        for (int i=0; i <=usersList.size()-1; i++){

            if (bankAccounts.contains(usersList.get(i).getUserName())){
                System.out.println("Acest user " + usersList.get(i).getUserName() + " are un bankacount");
            }
        }
    }
}
