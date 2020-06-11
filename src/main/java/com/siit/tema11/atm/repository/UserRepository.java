package com.siit.tema11.atm.repository;

import com.siit.tema11.atm.domain.User;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.siit.tema11.atm.repository.AccountRepository.*;

public class UserRepository {
    private static File userList = new File("src\\main\\java\\com\\siit\\tema11\\atm\\file\\userList.txt");

    private static  Scanner scanner =new Scanner(System.in);

    private static List<User> userActiveList = new ArrayList<>();

    public static void addNewUser () throws IOException {
        System.out.println("A new user will be created\n" +
                "Please insert the name:");
        String userName = scanner.nextLine();
        System.out.println("Please insert CNP");
        String cNP = scanner.nextLine();
      User user = new User(generateAccountsList().get(0).getIban(),generateAccountsList().get(0).getBalance(),userName,cNP);
      addUserToFile(user);
      deleteAndUpdatefile(user.getIban()); //sterge iban de pe lista de asteptare
      addIbanInUse(user.getIban()); //pune iban in use
       addNewBankAccount(); //genereaza un nou iban pe lista de asteptare

    }
    public static void withdraw (String iban, double withdraw) throws IOException {
        List<User> newupdatedUserList = new ArrayList<>();
        int count=0;
        for (User user: getUserActiveList()){
            if (user.getIban().equals(iban) && user.getBalance().compareTo(BigDecimal.valueOf(withdraw))>0){
                user.setBalance(user.getBalance().subtract(BigDecimal.valueOf(withdraw)));
                newupdatedUserList.add(user);
                System.out.println("Mr. " + user.getUserName()+ " your new ballance is " + user.getBalance() +" $");
                count=count+1;
            }else {
                newupdatedUserList.add(user);
            }
        }
        if (count ==0){
            System.out.println("Operation aborted, or insufficient funds ");
        }
        updateUserListFile(newupdatedUserList);
    }
    public static void deposit (String iban, double deposit) throws IOException {
        List<User> newUpdatedUseList = new ArrayList<>();
for (User user: getUserActiveList()){
    if (user.getIban().equals(iban)){
        user.setBalance(user.getBalance().add(new BigDecimal(deposit)));
        newUpdatedUseList.add(user);
        System.out.println("Mr. " + user.getUserName()+ " your new ballance is " + user.getBalance() +" $");
    }else {
        newUpdatedUseList.add(user);
    }
    updateUserListFile(newUpdatedUseList);
}

    }
    private static void updateUserListFile(List<User> usersLists) throws IOException {
        BufferedWriter updateUsersList = new BufferedWriter(new FileWriter(userList));
        for (User user:usersLists){
            updateUsersList.newLine();
            updateUsersList.write("Name :" +user.getUserName()+"\n" +
                    "CNP :"+ user.getCnp()+"\n" +
                    "IBAN :" + user.getIban()+"\n" +
                    "Balance :"+user.getBalance() +"\n" +
                    "=========================");
            updateUsersList.flush();

        }
    }
    private static List<User> getUserActiveList () throws IOException {
        List<User> usersList = new ArrayList<>();
        List<Integer> nameIndex = new ArrayList<>();
        List<Integer> cnpIndex = new ArrayList<>();
        List<Integer> ibanIndex = new ArrayList<>();
        List<Integer> balanceIndex=new ArrayList<>();
        List<Integer> separatorIndex = new ArrayList<>();
        for (int i=0; i<=getUserListToString().length()-26;i++){
            if (getUserListToString().substring(i, i+4).equals("Name")){
                nameIndex.add(i);
            }if (getUserListToString().substring(i, i+3).equals("CNP")){
                cnpIndex.add(i);
            }if(getUserListToString().substring(i, i+4).equals("IBAN")){
                ibanIndex.add(i);
            }if(getUserListToString().substring(i,i+7).equals("Balance")){
                balanceIndex.add(i);
            }if(getUserListToString().substring(i,i+25).equals("=========================")){
                separatorIndex.add(i);
            }
        }
        for (int i=0; i<=nameIndex.size()-1;i++){
            User tempUser = new User(getUserListToString().substring(ibanIndex.get(i)+6,balanceIndex.get(i)-2),
                    new BigDecimal(getUserListToString().substring(balanceIndex.get(i)+9,separatorIndex.get(i)-2)),
                           getUserListToString().substring(nameIndex.get(i)+6,cnpIndex.get(i)-2),
                            getUserListToString().substring(cnpIndex.get(i)+5,ibanIndex.get(i)-2));
            usersList.add(tempUser);

        }
        return usersList;
    }
    private static String getUserListToString () throws IOException {
        return Files.readAllLines(Paths.get(userList.getPath())).toString();


        //return Files.readAllLines(Paths.get(fileForBankAccount.getPath()))
    }
    public static void addUserToFile (User user) throws IOException {
        BufferedWriter newUser = new BufferedWriter(new FileWriter(userList, true));
        newUser.newLine();
        newUser.append("Name :" +user.getUserName()+"\n" +
                "CNP :"+ user.getCnp()+"\n" +
                "IBAN :" + user.getIban()+"\n" +
                "Balance :"+user.getBalance() +"\n" +
                "=========================");
        newUser.flush();

    }
    public static void deleteUser (String iban) throws IOException {
        if (checkIfIbanInUse(iban)){
            deleteAndUpdateIbanInUse(iban);
            List<User> intermediate=new ArrayList<>();
            for (User user: getUserActiveList()){
                if (!user.getIban().equals(iban)){
                    intermediate.add(user);
                    updateUserListFile(intermediate);
                }
            }


        }else {
            System.out.println("The IBAN " + iban + " is not valid, please try again.");
        }
    }

    public static void main(String[] args) throws IOException {
       //addNewUser(); //adauga user nou : CNP si Nume
        //System.out.println(getUserListToString());
        //System.out.println(getUserActiveList().get(1).getUserName() +"\n"+
            //    getUserActiveList().get(1).getBalance());
        //getUserActiveList();
        //updateUserListFile(getUserActiveList());
        //deposit("RO00INGB2015789010", 15.25);
        //withdraw("RO00INGB2015789010",100);
        //addNewUser();
        //deposit("RO00INGB2015789012", 35.15);
        //withdraw("RO00INGB2015789012", 20);
        //addNewUser();
        //deleteUser("nfeinfningifnfi");
        //addNewUser();
        deleteUser("RO00INGB2015789014");

    }

}

/*
  usersList.add(new User(getUserListToString().substring(nameIndex.get(i)+6,cnpIndex.get(i)-2)
            , BigDecimal.valueOf(Integer.parseInt(getUserListToString().substring(balanceIndex.get(i)+9,separatorIndex.get(i)-2))),
                    )
 */