package com.siit.tema11.atm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ciorna {
    public static void main(String[] args) {
        List<Integer> nameIndex = new ArrayList<>();
        List<Integer> cnpIndex = new ArrayList<>();
        List<Integer> ibanIndex = new ArrayList<>();
        List<Integer> balanceIndex=new ArrayList<>();
        List<Integer> separatorIndex = new ArrayList<>();

        String getUserListToString = ", Name :Nicolae Dobrin, CNP :12345678, IBAN :RO00INGB2015789010, Balance :15788.324, =========================, Name :Gheorghe Hagi, CNP :12345679, IBAN :RO00INGB2015789011, Balance :0.0, =========================]\n";

        for (int i=0; i<=getUserListToString.length()-27;i++){
            if (getUserListToString.substring(i, i+4).equals("Name")){
                nameIndex.add(i);
            }if (getUserListToString.substring(i, i+3).equals("CNP")){
                cnpIndex.add(i);
            }if(getUserListToString.substring(i, i+4).equals("IBAN")){
                ibanIndex.add(i);
            }if(getUserListToString.substring(i,i+7).equals("Balance")){
                balanceIndex.add(i);
            }if(getUserListToString.substring(i,i+25).equals("=========================")){
                separatorIndex.add(i);
            }
        }


        System.out.println(nameIndex.toString()+"\n" +
                cnpIndex+"\n"
        +separatorIndex);
        //System.out.println(getUserListToString.substring(nameIndex.get(0)+6,cnpIndex.get(0)-2)); //numele
        //System.out.println(getUserListToString.substring((cnpIndex.get(0)+5),ibanIndex.get(0)-2));//CNP
        //System.out.println(getUserListToString.substring(ibanIndex.get(0)+6,balanceIndex.get(0)-2));//IBAN
        System.out.println(BigDecimal.valueOf(Integer.parseInt(getUserListToString.substring(balanceIndex.get(0)+9,separatorIndex.get(0)-2))));

    }
}
