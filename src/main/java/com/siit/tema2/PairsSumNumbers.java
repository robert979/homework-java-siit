package com.siit.tema2;

import java.util.Scanner;

public class PairsSumNumbers {
    public static void main (String [] args) {
        int[] m = {10, 2, 4, 8, 12, 9, 5, 7, 8, 3};
        checkPairsForGivenSum(m);
    }
    public static void checkPairsForGivenSum(int[] m){
        Scanner y = new Scanner(System.in);
        System.out.println("Introduceti suma dorita");
        int b = y.nextInt();
        int l=m.length;
        for (int i=0; i<=l-2;i++){
            for (int j =i+1; j<=l-1; j++) {
                if (m[i] + m[j] == b) {
                    System.out.print(m[i] + ", " + m[j] + "; ");

                }
            }

        }




    }

}
