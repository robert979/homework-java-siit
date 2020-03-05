package com.siit.tema2;

import java.util.Scanner;

public class MaxDigitAndPalindromMetode {
    public static void main(String ... args){
        Scanner numar = new Scanner(System.in);
        System.out.println("Introduceti numarul");
        long n=numar.nextLong();
        findMaxDigit(n);
        checkPalindrom(n);

    }
    public static void findMaxDigit(long n){
        long x=n;
        int a=0;
        while (x!=0){
            int b=  (int)x%10;
            if (a<b) {
                a= b;
            }
            x/=10;
            }
        System.out.println(" Cifra maxima a numarului " + n +" este " + a);
        }
        public static long checkPalindrom(long n){
        long c=0;
        long b=n;
        while (b!=0) {
            c=10*c + b%10;
            b/=10;

        }

        if (c == n){
            System.out.println("Numarul " + c + " este un palindrom");
        }
        return b;
        }
        }



