package com.siit.tema4.atm;

import java.util.ArrayList;

public class User {
    private String userName;
    private String cnp;
    
    public User (String userName, String cnp){
        this.userName = userName;
        this.cnp=cnp;
    }

    public static void prinUserDetails (ArrayList<User> users, ArrayList<BankAccount> bankAccounts, ArrayList<Card> cards, int i ){
       int lCards=cards.size();
       int lAccounts = bankAccounts.size();
    }

    public void printAllUsers (ArrayList<User> users){
        for (int i=0; i<=users.size()-1; i++){
            System.out.println("User " + (i+1) +" has the Name: " +  users.get(i).getUserName() + " and his ID is " + i );
        }
    }
    
    public String getUserName (){
        return userName;
    }

    public void setUserName (String userName){
        this.userName=userName;
    }

    public String getCnp (){
        return cnp;
    }

    public void setCnp (String cnp){
        this.cnp=cnp;
    }
}
