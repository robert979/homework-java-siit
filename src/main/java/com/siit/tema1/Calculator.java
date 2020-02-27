package com.siit.tema1;

import java.util.Scanner;

public class Calculator {
    public static void main (String [] args) {
        Scanner obiect=new Scanner(System.in);
        System.out.println("Introduceti numarul a");
        int a= obiect.nextInt();

        Scanner obiect1=new Scanner(System.in);
        System.out.println("Introduceti numarul b");
        int b=obiect1.nextInt();

        Scanner operatia= new Scanner(System.in);
        System.out.println("Introduceti operatia");
        String c =operatia.nextLine();

        if(c.equals("+")){
            System.out.println("a+b = " + (a+b) );
            //nu merge c == "+"
        }
        else if (c.equals("-")){
            System.out.println("a-b = " + (a-b));
        }
        else if (c.equals("*")){
            System.out.println("(a*b) = " + (a*b));
        }
        else if (c.equals("/")){
            System.out.println("(a/b) = " +(((float) a)/ ((float) b) ));
        }
        else {
            System.out.println("Ati introdus gresit operatorul");
        }

    }
}
