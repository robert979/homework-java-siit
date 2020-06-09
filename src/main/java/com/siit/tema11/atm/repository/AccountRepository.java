package com.siit.tema11.atm.repository;

import com.siit.tema11.atm.domain.BankAccount;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AccountRepository {

    private static File fileForBankAccount = new File("src\\main\\java\\com\\siit\\tema11\\atm\\file\\fileBankAccount.txt");
    private static File fileForTest = new File("src\\main\\java\\com\\siit\\tema11\\atm\\file\\fileBankAccount11.txt");
    public static List<BankAccount> bankAccountList = Arrays.asList(
            new BankAccount("RO00INGB2015789012", BigDecimal.valueOf(0))
    );
    public static void deleteAndUpdatefile(String iban) throws IOException {
        BufferedWriter newWriter = new BufferedWriter(new FileWriter(fileForTest));
        newWriter.write("|       IBAN       | Balance |");

        for (int i = 0; i <= deleteAccount(iban).size() - 1; i++) {
            newWriter.newLine();
           newWriter.write("|" + deleteAccount(iban).get(i).getIban() + "|   " + deleteAccount(iban).get(i).getBalance().add(BigDecimal.valueOf(0.00)) + "   ");

        }
        newWriter.close();

    }
    private static List<BankAccount> deleteAccount (String iban) throws IOException {
        List<BankAccount> listAfterIbanDeleted = new ArrayList<>();
        for (BankAccount b: generateAccountsList())
            if (!b.getIban().equals(iban)){
                listAfterIbanDeleted.add(b);
            }
        return listAfterIbanDeleted;
    }

    public static List<BankAccount> generateAccountsList() throws IOException {
        List<BankAccount> allBanckAccounts = new ArrayList<>();

        for (String s : convertFileIntoList()) {
            allBanckAccounts.add(new BankAccount((s.substring(1, 19)), new BigDecimal(s.substring(20, 26).trim())));

        }
        return allBanckAccounts;
    }
    public static void addNewBankAccount () throws IOException {
        String bankAccountConverted ="|"+ generateNewBankAccount().getIban()+ "|   " + generateNewBankAccount().getBalance() + "   ";
        BufferedWriter newText = new BufferedWriter(new FileWriter(fileForBankAccount, true));
        newText.newLine();
        newText.append(bankAccountConverted);
        newText.close();

        //newWriter.write("|" + bankAccountList.get(i).getIban() + "|   " + bankAccountList.get(i).getBalance().add(BigDecimal.valueOf(0.00)) + "   |");
    }
    private static BankAccount generateNewBankAccount () throws IOException {
      return new BankAccount(findNextIban(), BigDecimal.valueOf(0.00));

    }

    static List<String> convertFileIntoList() throws IOException {
        return Files.readAllLines(Paths.get(fileForBankAccount.getPath()))
                .stream()
                .skip(1)
                .collect(Collectors.toList());
    }


    private static String findNextIban () throws IOException {
        String nextIban = "RO00INGB"+ (Integer.parseInt(convertFileIntoList().get(convertFileIntoList().size()-1).substring(9, 19))+1);

               return nextIban;
    }

    /*
    public static void addAccount() throws IOException {
        BufferedWriter accountToAppend = new BufferedWriter(new FileWriter(fileForBankAccount, true));
        accountToAppend.newLine();
        accountToAppend.write("|RO00INGB" + generateBankAccount().getIban() + "|   " + generateBankAccount().getBalance() + "   |");
        accountToAppend.flush();
//printToFile();


    }
    */


    /*public static BankAccount generateBankAccount() {
        String bankAccount = String.valueOf(Integer.parseInt(bankAccountList.get(bankAccountList.size() - 1).getIban().substring(8)) + 1);
        BankAccount newBankAccount = new BankAccount(bankAccount, BigDecimal.valueOf(0.00));
        return newBankAccount;
    }

     */

    public static void printToFile() {
        try {
            BufferedWriter newWriter = new BufferedWriter(new FileWriter(fileForBankAccount));
            newWriter.write("|       IBAN       | Balance |");
            newWriter.newLine();
            for (int i = 0; i <= bankAccountList.size() - 1; i++) {
                newWriter.write("|" + bankAccountList.get(i).getIban() + "|   " + bankAccountList.get(i).getBalance().add(BigDecimal.valueOf(0.00)) + "   |");
            }
            newWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException {

        //(s.substring(1, 19)), new BigDecimal(s.substring(20, 29).trim())))
        //System.out.println(generateAccountsList().get(1).getIban());
       // System.out.println(convertFileIntoList().get(0).substring(1, 19));
        //System.out.println(convertFileIntoList().get(0).substring(20, 26).trim());
        /*String iban="RO00INGB2015789014";
        for (BankAccount b:deleteAccount(iban)){
            System.out.println(b.getIban());
        }

         */
       deleteAndUpdatefile("fdfd");
       //addNewBankAccount();

    }
}