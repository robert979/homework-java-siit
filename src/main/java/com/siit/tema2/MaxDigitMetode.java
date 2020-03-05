package com.siit.tema2;

import java.util.Scanner;

public class MaxDigitMetode {
    public static void main(String ... args){
        Scanner numar = new Scanner(System.in);
        System.out.println("Introduceti numarul");
        long n=numar.nextLong();
        findMaxDigit(n);

    }
    public static void findMaxDigit(long n){
        long x=n;
        int a=0;
        while (x!=0){
            long b=  x%10;
            if (a<b) {
                a= (int)b;
            }
            x/=10;
            }
        System.out.println(" Cifra maxima a numarului " + n +" este " + a);
        }
        }



