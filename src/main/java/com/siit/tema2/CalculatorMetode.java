package com.siit.tema2;

import java.util.Scanner;

public class CalculatorMetode {
    public static void main (String ... args){
        Scanner numere = new Scanner(System.in);
        System.out.println("Introduceti primul numar");
        int a=numere.nextInt();
        System.out.println("Introduceti al doilea numar");
        int b=numere.nextInt();
        calculeaza(a,b);
    }
    public static int calculeaza(int a, int b){
        Scanner op = new Scanner(System.in);
        System.out.println("Introduceti operatia");
        String operator=op.nextLine();

        String str;
        char [] A = operator.toCharArray();
        int c=0;
        if (A[0] == '+'){
            System.out.println("Suma numerelor este " + (a + b));
        }
        else if (A[0] == '-') {
            System.out.println("Diferenta dintre cele doua numere este " + (a - b));
        }
        else if (A[0] == '*') {
            System.out.println("Rezultatul inmultirii celor doua numere este " + a*b);
        }
        else if (A[0] == '/') {
            System.out.println("Rezultatul impartirii celor doua numere este" + ((float) a/b));
        }
        else {
            System.out.println("Operatorul introdus este gresit");
        }


        return a;
    }
}
