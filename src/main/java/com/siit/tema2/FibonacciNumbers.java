package com.siit.tema2;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main (String... args){
        Scanner num= new Scanner(System.in);
        System.out.println("Cate numere Fibonacci doriti sa fie afisate");
        int n=num.nextInt();
        long [] sir=new long[n];
        calculeazaSirulFibonacci(sir);
        System.out.println(Arrays.toString(sir));

    }
    public static void calculeazaSirulFibonacci(long[]sir){

        int n = sir.length;

        sir[0]=0;

        for (int i=1; i<=n-1; i++){
            double b=Math.pow(1.618033988749895,i);
            double c=Math.pow(0.6180339887,i);
            sir[i]= Math.round((b+c)/(Math.sqrt(5)));
        }
    }
}
