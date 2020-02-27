package com.siit.tema1;

import java.util.Scanner;

public class ArraySmallestForEach {
    public static void main(String... args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Introduceti lungimea sirului");
        int a=x.nextInt();

        int [] sir= new int[a] ;
        for (int k=0; k<=a-1;k++){
            Scanner y=new Scanner(System.in);
            System.out.println("introduceti numarul " + (k+1) + " al sirului");
            sir[k] = y.nextInt();
        }
        System.out.println("Sirul este " );
        for (int q=0; q<a; q++){
            System.out.print("" + sir[q] +", ");
        }
        System.out.println();
        int u= sir[0];
        for (int str: sir){

            if (u>str) {
                u=str;
            }

        }
        System.out.println("cel mai mic numar al sirului este " + u);



    }

}


