package com.siit.tema1;

import java.util.Scanner;

public class Palindrom {
    public static void main (String... args){
        Scanner numar = new Scanner(System.in);
        System.out.println("introduceti numarul");
        int x =numar.nextInt();
        int k=x;
        //int k = numar.nextInt();
        int y=0;

        while (x!=0){
            int cifra=x%10;
             y = y*10 +cifra;
            x=x/10;
        }

        if(k==y){
            System.out.print("numarul " +k +  " este un palindrom");
        }
        else {
            System.out.println("inversul numarului este " + y);
        }

    }
}
