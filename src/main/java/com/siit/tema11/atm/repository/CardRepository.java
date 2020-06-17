//createCarNumberListFromFile - transforma fisierul DOAR cu linii de Card Number in List<Integer>   --> private
//generateNewCardNumber - creaza un nou card number adaugand "1" ultimului car number din lista     -->private

package com.siit.tema11.atm.repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.siit.tema11.atm.repository.AccountRepository.*;
import static com.siit.tema11.atm.repository.UserRepository.*;

public class CardRepository {
    private static Scanner scanner = new Scanner(System.in);
    private static File cardFile = new File("src\\main\\java\\com\\siit\\tema11\\atm\\file\\card\\cardFilet.txt");
    private static File cardNewNumbers = new File("src\\main\\java\\com\\siit\\tema11\\atm\\file\\card\\cardNumberList.txt");

    private static int generateNewCardNumber () throws IOException {
        int a = (createCarNumberListFromFile(cardNewNumbers).get(createCarNumberListFromFile(cardNewNumbers).size()-1))+1;
        return a;

    };
    private static void addNewCardNumberToFile () throws IOException {
        BufferedWriter newCardNumber = new BufferedWriter (new FileWriter(cardNewNumbers, true));
        newCardNumber.newLine();
        newCardNumber.append(String.valueOf( generateNewCardNumber()));
        newCardNumber.flush();

    }

    private static List <Integer> createCarNumberListFromFile (File file) throws IOException {
        return Files.readAllLines(Paths.get(file.getPath()))
                .stream()
                .skip(1)
                .map(n->Integer.parseInt(n))
                .collect(Collectors.toList());


        /*
         return Files.readAllLines(Paths.get(fileForBankAccount.getPath()))
                .stream()
                .skip(1)
                .collect(Collectors.toList());
         */

    }

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
        //addNewCard("RO00INGB2015789019");
        //System.out.println(createCarNumberListFromFile(cardNewNumbers));
        //System.out.println(generateNewCardNumber());
        addNewCardNumberToFile();

    }


}