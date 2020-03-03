package com.siit.tema2;

import java.util.Scanner;

public class FactorialMetode {
    static public void main(String [] args){
        Scanner numar = new Scanner(System.in);
        System.out.println("Introduceti numarul al carui factorial doriti sa-l calculati");
        int n = numar.nextInt();
        returnFactorial(n);

    }
    static public void returnFactorial(int n){
        int c=1;
        for (int i=1; i<=n; i++) {
             c = c * i;

        }

        System.out.println(n + "! = " + c);

    }

}
