package com.siit.tema1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArraySmallestNumber {
    public static void main (String [] args){
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
        int b=sir[0];
        for (int k=1; k<=a-1; k++) {
            if (b > sir[k]) {
                b= sir[k];}

            }
        System.out.println("cel mai mic numar al sirului este " + b);
        }



    }

