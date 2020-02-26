package com.siit.tema1;

import java.util.Scanner;

public class NumerePrime {
    public static void main (String...args){
        Scanner numar = new Scanner(System.in);
        System.out.println("introduceti numarul");
        int x= numar.nextInt();

        int suma=0;

        for (int i=2; i<=x; i++) {
            boolean conditie= true;
            for (int j = 2; j<=i/2; j++){
                if (i%j==0){
                    conditie=false;
                }
            }
            if(conditie){

                System.out.println(i + " ");
                suma = suma +i;

            }
        }
        System.out.println("suma = " + suma);

    }
}
