package com.siit.tema11.atm.repository;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static com.siit.tema11.atm.repository.AccountRepository.*;
import static com.siit.tema11.atm.repository.UserRepository.*;

public class CardRepository {
    private static Scanner scanner = new Scanner(System.in);
    private static File cardFile = new File("src\\main\\java\\com\\siit\\tema11\\atm\\file\\cardFilet.txt");

    public static void addNewCard(String iban) throws IOException {
        if (checkIfIbanInUse(iban)){
            System.out.println("Please chose your PIN number - 4 digits");
            String pin = scanner.next();
            if (checkIfPinValid(pin)){

            }

        }else {
            System.out.println("Ivalid IBAN, the Card was not issued");
        }

    }
    private static Boolean checkIfPinValid (String pin){

        boolean test = false;
        String pinToBeChecked = pin+"0";
        if (pin.length()==4){
            String testNr = "0123456789";
                for (int i=0; i<=pinToBeChecked.length()-2;i++){
                    if (testNr.contains(pinToBeChecked.substring(i, i+1))){
                        test = true;
                    }else {
                        System.out.println("Invalid PIN format - this must be 4 digits exactly");
                        return false;

                    }
                }
            } else {
            System.out.println("Invalid PIN format - this must be 4 digits exactly");
            return false;
        }
        return test;

        }

    public static void main(String[] args) throws IOException {
        //System.out.println(checkIfPinValid("a124"));
        addNewCard("RO00INGB2015789013");

    }


}