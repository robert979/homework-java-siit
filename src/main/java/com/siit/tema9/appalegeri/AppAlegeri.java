package com.siit.tema9.appalegeri;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//allCNPs
//1800306040735
//1800306040736
//1800306040737
//1800306040738
//1800306040739
//1800306040739
//1800306040740
//1800306040741
//1800306040742
//1800306040743
public class AppAlegeri {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Path path = Paths.get("CNP_List.txt");
        String allInformation = Files.readString(path, StandardCharsets.US_ASCII);
        System.out.println(allInformation);
        List<String> cnpList = new ArrayList<>();
        List<String> cnpListVoted = new ArrayList<>();
        List<String> cnpListNonvoted = cnpList;
        BigDecimal Ionescu = BigDecimal.valueOf(0);
        BigDecimal Popescu = BigDecimal.valueOf(0);
        BigDecimal Costache = BigDecimal.valueOf(0);
        BigDecimal Voicu = BigDecimal.valueOf(0);
        BigDecimal Protopopescu = BigDecimal.valueOf(0);
        String strAnswer = "yes";
        for (int i = 0; i <= allInformation.length() - 22; i++) {
            if (allInformation.substring(i, i + 3).equals("CNP")) {
                String strTemp = allInformation.substring(i + 5, i + 19);
                cnpList.add(strTemp);
            }
        }
        for (String str : cnpListNonvoted) {
            System.out.println(str);
        }
        while (strAnswer.equals("yes")) {
            System.out.println("Please chose your action");
            System.out.println("Please insert your CNP");
            String cnpReader = input.nextLine();
            if (cnpList.contains(cnpReader)) {
                if (!cnpListVoted.contains(cnpReader)) {
                    System.out.println();
                }
            }

        }
    }

}

