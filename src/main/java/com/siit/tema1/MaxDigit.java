package com.siit.tema1;

import java.util.Scanner;

public class MaxDigit {
    public static void main (String [] args){
        Scanner numar=new Scanner(System.in);
        System.out.println("introduceti numarul ");
        int x= numar.nextInt();
        int a=0;
        
        while (x!=0){
            int b= x%10;
            if (a<b) {
                a=b;}
            x/=10;
            }
        System.out.println("cifra cea mai mare a numarului este " + a);
        }
    }

