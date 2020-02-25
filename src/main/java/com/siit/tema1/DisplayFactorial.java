package com.siit.tema1;

import java.util.Scanner;

public class DisplayFactorial {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int i = scanner.nextInt();
        //System.out.println(i);


        int c = 1;
        for (int a = 1; a <= i; a++) {
            c = c * a;

        }
        System.out.println(i + "! = " + c);

    }
}