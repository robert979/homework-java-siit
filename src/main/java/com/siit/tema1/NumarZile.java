package com.siit.tema1;

import java.util.Scanner;

public class NumarZile {
    public static void main(String [] args){
        Scanner luna=new Scanner(System.in);
        System.out.println("Intoduceti numarul lunii");
        int n = luna.nextInt();


        int[] luna31 = {1, 3, 5, 7, 8, 10, 12};
        int[] luna30 = {4, 6, 9, 11};
        int[] lunafeb = {2};


        for (int x : luna31) {
            if (n == x) {
                System.out.println("luna are 31 de zile");
            }

        }
        for (int y : luna30) {
            if (n == y) {
                System.out.println("luna are 30 de zile");
            }
        }
        for  (int z: lunafeb) {
            if (n==z) {
                System.out.println("luna are 28 sau 29 de zile");
                break;
            }
        }

        for (;n< 1|| n>12;) {
            System.out.println("trebuie sa introduceti o cifra intre 1 si 12");
            break;
        }

    }
}
