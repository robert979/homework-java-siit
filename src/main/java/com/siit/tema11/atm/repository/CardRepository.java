//createCarNumberListFromFile - transforma fisierul DOAR cu linii de Card Number in List<Integer>   --> private
//generateNewCardNumber - creaza un nou card number adaugand "1" ultimului car number din lista     -->private
//addNewCardNumberToFile - append DOAR la cardNewNumbers un nou "generateNewCardNumber"           --> private
//generateNewNewNumbersFile - genereza un fisier nou de NewCardNumbers din care scoate primul indice (indice 0 omis) --> private
//addCardNumberInUseToFile - Iia primul cardNumber  din NewNumbers si il adauga la sfarsitul fisierului CardFileInUse
//writeFileInUse - genereaza de la inceput fileInUse - dupa ce a fost sters un card number --> se foloseste DOAR in deleteSpecificCardNumberAndUpdateTheFile
//


package com.siit.tema11.atm.repository;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.siit.tema11.atm.repository.AccountRepository.*;

public class CardRepository {
    private static Scanner scanner = new Scanner(System.in);
    private static File test = new File("src\\main\\java\\com\\siit\\tema11\\atm\\file\\card\\test.txt");
    private static File cardFileInUse = new File("src\\main\\java\\com\\siit\\tema11\\atm\\file\\card\\cardFileInUse.txt");
    private static File cardNewNumbers = new File("src\\main\\java\\com\\siit\\tema11\\atm\\file\\card\\cardNumberList.txt");
    private static File deletedCardNumbers = new File("src\\main\\java\\com\\siit\\tema11\\atm\\file\\card\\deletedCards.txt");

    private static int generateNewCardNumber () throws IOException {
        int a = (createCardNumberListFromFile(cardNewNumbers)
                .get(createCardNumberListFromFile(cardNewNumbers).size()-1))+1;
        return a;

    };
    private static void deleteSpecificCardNumberAndUpdateTheFile (Integer CardNumber) throws IOException {
        List<Integer> temp = new ArrayList<>();

                for (Integer intr: createCardNumberListFromFile(cardFileInUse)){
                    if (!intr.equals(CardNumber)){
                        temp.add(intr);
                    }
                }
                writeFileInUse(temp);
                addCardNumberToDeletedCardsFile(CardNumber);


    }
    private static void addCardNumberToDeletedCardsFile (Integer integer) throws IOException {
        BufferedWriter addDeletedNumber = new BufferedWriter(new FileWriter(deletedCardNumbers,true));
        addDeletedNumber.newLine();
        addDeletedNumber.append(String.valueOf(integer));
        addDeletedNumber.close();
    }
    private static void writeFileInUse (List<Integer> list) throws IOException {
        BufferedWriter fileCardsInUse = new BufferedWriter(new FileWriter(cardFileInUse));
        fileCardsInUse.write("CARD NUMBER LIST IN USE");
        for (Integer integer:list){
            fileCardsInUse.newLine();
            fileCardsInUse.write(String.valueOf(integer));
                    }
        fileCardsInUse.close();
    }
    private static void generateNewNewNumbersFile () throws IOException {
        List<Integer> temp = createCardNumberListFromFile(cardNewNumbers);
        BufferedWriter newWriter = new BufferedWriter(new FileWriter(cardNewNumbers ));
        newWriter.write("CARD NUMBER LIST READY TO BE USED");
        for (int i=1; i<=temp.size()-1;i++){
            newWriter.newLine();
            newWriter.write(temp.get(i).toString() );
        }     newWriter.close();
    }
    private static void addNewCardNumberToFile () throws IOException {
        BufferedWriter newCardNumber = new BufferedWriter (new FileWriter(cardNewNumbers, true));
        newCardNumber.newLine();
        newCardNumber.append(String.valueOf( generateNewCardNumber()));
        newCardNumber.flush();

    }
    private static void addCardNumberInUseToFile() throws IOException {
        BufferedWriter addCardInUse = new BufferedWriter(new FileWriter(cardFileInUse,true));
        addCardInUse.newLine();
        addCardInUse.append(String.valueOf(createCardNumberListFromFile(cardNewNumbers).get(0)));
        addCardInUse.close();
    }

    private static List <Integer> createCardNumberListFromFile(File file) throws IOException {
        return Files.readAllLines(Paths.get(file.getPath()))
                .stream()
                .skip(1)
                .map(n->Integer.parseInt(n))
                .collect(Collectors.toList());

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
        //System.out.println(createCardNumberListFromFile(cardFileInUse));
        //System.out.println(generateNewCardNumber());
        //addNewCardNumberToFile();
        //generateNewNewNumbersFile();
        //addCardNumberInUseToFile();
        //System.out.println(createCardNumberListFromFile(cardNewNumbers).get(0).toString());
       deleteSpecificCardNumberAndUpdateTheFile(1790219000);
       // addCardNumberToDeletedCardsFile(1790219004);
       //writeFileInUse(createCardNumberListFromFile(cardNewNumbers));

    }


}