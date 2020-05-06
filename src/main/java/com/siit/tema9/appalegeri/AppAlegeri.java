package com.siit.tema9.appalegeri;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AppAlegeri {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("CNP_List.txt");
        String allInformation = Files.readString(path, StandardCharsets.US_ASCII);
        System.out.println(allInformation);
        List<String> cnpList = new ArrayList<>();
        List<String> cnpListVoted = new ArrayList<>();
        for (int i = 0; i <= allInformation.length() - 22; i++) {
            if (allInformation.substring(i, i + 3).equals("CNP")) {
                String strTemp = allInformation.substring(i + 5, i + 19);
                cnpList.add(strTemp);
            }
        }
        for (String str : cnpList) {
            System.out.println(str);
        }
    }

}

