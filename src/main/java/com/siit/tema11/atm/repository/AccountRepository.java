package com.siit.tema11.atm.repository;

import com.siit.tema11.atm.domain.BankAccount;

import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountRepository {
    private static File fileForBankAccount = new File("src\\main\\java\\com\\siit\\tema11\\atm\\file\\fileBankAccount.txt");
public static List<BankAccount> bankAccountList = Arrays.asList(
        new BankAccount("RO00INGB2015789012", BigDecimal.valueOf(0))
);
public static void addAccount () throws IOException {
BufferedWriter accountToAppend = new BufferedWriter(new FileWriter(fileForBankAccount, true));
accountToAppend.write("|RO00INGB"+generateBankAccount().getIban()+"|   "+generateBankAccount().getBalance()+"   |");
accountToAppend.flush();
//printToFile();


}
    public static BankAccount generateBankAccount (){
        String bankAccount= String.valueOf(Integer.parseInt(bankAccountList.get(bankAccountList.size()-1).getIban().substring(8))+1);
        BankAccount newBankAccount= new BankAccount(bankAccount, BigDecimal.valueOf(0.00));

        return newBankAccount;
    }

public static void printToFile (){
    try {
        BufferedWriter newWriter = new BufferedWriter(new FileWriter(fileForBankAccount));
        newWriter.write("|       IBAN       | Balance |");
        newWriter.newLine();
        for (int i=0;i<=bankAccountList.size()-1;i++){
            newWriter.write("|"+bankAccountList.get(i).getIban() +"|   "+bankAccountList.get(i).getBalance().add(BigDecimal.valueOf(0.00))+"   |");
        }
        newWriter.close();

    } catch (IOException e) {
        e.printStackTrace();
    }

}
}
