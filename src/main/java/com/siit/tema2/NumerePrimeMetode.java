package com.siit.tema2;

import java.util.Scanner;

public class NumerePrimeMetode {
    public static void main (String ... args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Introduceti numarul");
        long n=input.nextInt();
        gasesteNrPrime(n);

    }
    public static long gasesteNrPrime(long n){


        int sum=0;
        String sir = "[";
        for (int i=2; i<=n; i++){
            int c=0;
            for (int j=1; j<=i; j++) {

                if (i%j==0 ){

                    c=c+1;
                }
                }
            if (c==2){
                sum=sum+i;
                sir = sir + i + ", ";


            }

        }
        sir = sir + "]";
        System.out.println(sir);
        System.out.println("suma este " + sum);
        return n;
    }
}
