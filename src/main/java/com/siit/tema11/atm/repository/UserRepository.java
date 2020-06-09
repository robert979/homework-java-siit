package com.siit.tema11.atm.repository;

import com.siit.tema11.atm.domain.User;
import com.siit.tema11.atm.repository.AccountRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.siit.tema11.atm.repository.AccountRepository.generateAccountsList;

public class UserRepository {
    private static  Scanner scanner =new Scanner(System.in);

    private static List<User> userActiveList = new ArrayList<>();

    public static void addNewUser () throws IOException {
        System.out.println("A new user will be created\n" +
                "Please insert the name:");
        String userName = scanner.nextLine();
        System.out.println("Please insert CNP");
        String cNP = scanner.nextLine();
      User user = new User(generateAccountsList().get(0).getIban(),generateAccountsList().get(0).getBalance(),userName,cNP);

    }

}
