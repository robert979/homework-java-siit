package com.siit.tema2;

import java.util.Scanner;

public class NumarZileMetode {
    public static void main(String... args) {
        Scanner luna = new Scanner(System.in);
        System.out.println("Introduceti luna al carei numar de zile doriti sa-l aflati");
        String l = luna.nextLine();
        afiseazaNrZile(l);
    }

    public static String afiseazaNrZile(String l) {
        String[] luna31 = {"1", "3", "5", "7", "8", "10", "12", "ianuarie", "martie", "mai", "iulie", "august", "octombrie", "decembrie", "Ianuarie",
                "Martie", "Mai", "Iulie", "August", "Octombrie", "Decembrie"};
        String[] luna30 = {"4", "6", "9", "11"};
        String [] februarie= {"2" , "februarie" , "Februarie"};

        for (String str : luna31) {
            if (l.equals(str)) {
                System.out.println("Luna " + l + " are 31 de zile");
                }

        }

        for (String str : luna30) {
            if (l.equals(str)) {
                System.out.println("Luna " + l + " are 30 de zile");
                break;
            }


        }
        for (String str : februarie) {
            if (l.equals(str)) {
                Scanner year=new Scanner(System.in);
                System.out.println("Introduceti anul");
                int an=year.nextInt();
                if(an%4==0){
                    System.out.println("Luna are 29 de zile");}
                else {
                    System.out.println("Luna are 28 de zile");
                }
                }

            }


            return l;
        }

}
