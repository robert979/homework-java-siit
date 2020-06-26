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
    private static File fileIbanInUse = new File("src\\main\\java\\com\\siit\\tema11\\atm\\file\\IbanInUse.txt");
    private static File fileIbanDeleted = new File("src\\main\\java\\com\\siit\\tema11\\atm\\file\\deletedIban.txt");
    public static List<BankAccount> bankAccountList = Arrays.asList(
            new BankAccount("RO00INGB2015789012", BigDecimal.valueOf(0))
    );

    public static void addIbanInUse(String iban) throws IOException {
        BufferedWriter ibanInUse = new BufferedWriter(new FileWriter(fileIbanInUse, true));
        ibanInUse.newLine();
        ibanInUse.write(iban);
        ibanInUse.flush();
    }

    public static void deleteAndUpdatefile(String iban) throws IOException { //sterge iban de pe lista iban in asteptare
        List<BankAccount> intermediate = deleteAccount(iban);
        BufferedWriter newWriter = new BufferedWriter(new FileWriter(fileForBankAccount));
        newWriter.write("|       IBAN       | Balance |");


        for (int i = 0; i <= intermediate.size() - 1; i++) {
            newWriter.newLine();
            newWriter.write("|" + intermediate.get(i).getIban() + "|   " + intermediate.get(i).getBalance().add(BigDecimal.valueOf(0.00)) + "   ");

        }
        newWriter.close();

    }

    private static void storeDeletedIban(String iban) throws IOException {
        BufferedWriter storeIban = new BufferedWriter(new FileWriter(fileIbanDeleted, true));
        storeIban.newLine();
        storeIban.write(iban);
        storeIban.close();
    }

    public static void deleteAndUpdateIbanInUse(String iban) throws IOException { //sterge iban de pe lista iban in asteptare
        List<String> intermediate = deleteIbanInUse(iban);
        BufferedWriter newWriter = new BufferedWriter(new FileWriter(fileIbanInUse));
        newWriter.write("IBAN in use");


        for (int i = 0; i <= intermediate.size() - 1; i++) {
            newWriter.newLine();
            newWriter.write(intermediate.get(i));

        }
        storeDeletedIban(iban);
        newWriter.close();

    }

    private static List<String> deleteIbanInUse(String iban) throws IOException { //aici stergere iban din iban in use

        List<String> listAfterIbanDeleted = new ArrayList<>();

        for (String ibanIterator : convertIbanInUseToList())
            if (!ibanIterator.equals(iban)) {
                listAfterIbanDeleted.add(ibanIterator);

            }
        return listAfterIbanDeleted;


    }

    private static List<BankAccount> deleteAccount(String iban) throws IOException {
        List<BankAccount> listAfterIbanDeleted = new ArrayList<>();
        for (BankAccount b : generateAccountsList())
            if (!b.getIban().equals(iban)) {
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

    public static void addNewBankAccount() throws IOException {
        String bankAccountConverted = "|" + generateNewBankAccount().getIban() + "|   " + generateNewBankAccount().getBalance() + "   ";
        BufferedWriter newText = new BufferedWriter(new FileWriter(fileForBankAccount, true));
        newText.newLine();
        newText.append(bankAccountConverted);
        newText.close();

        //newWriter.write("|" + bankAccountList.get(i).getIban() + "|   " + bankAccountList.get(i).getBalance().add(BigDecimal.valueOf(0.00)) + "   |");
    }

    private static BankAccount generateNewBankAccount() throws IOException {
        return new BankAccount(findNextIban(), BigDecimal.valueOf(0.00));

    }

    private static List<String> convertIbanInUseToList() throws IOException {
        return Files.readAllLines(Paths.get(fileIbanInUse.getPath()))
                .stream()
                .skip(1)
                .collect(Collectors.toList());
    }

    public static List<BankAccount> generateIbanInUseList() throws IOException {
        List<BankAccount> allBanckAccounts = new ArrayList<>();

        for (String s : convertIbanInUseToList()) {
            allBanckAccounts.add(new BankAccount((s.substring(1, 19)), new BigDecimal(s.substring(20, 26).trim())));

        }
        return allBanckAccounts;
    }

    static List<String> convertFileIntoList() throws IOException {
        return Files.readAllLines(Paths.get(fileForBankAccount.getPath()))
                .stream()
                .skip(1)
                .collect(Collectors.toList());
    }


    private static String findNextIban() throws IOException {
        String nextIban = "RO00INGB" + (Integer.parseInt(convertFileIntoList().get(convertFileIntoList().size() - 1).substring(9, 19)) + 1);

        return nextIban;
    }

    public static boolean checkIfIbanInUse(String iban) throws IOException {
        boolean condition = false;
        for (String s : convertIbanInUseToList()) {
            if (s.equals(iban)) {
                condition = true;
                break;
            }
        }
        return condition;
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


}