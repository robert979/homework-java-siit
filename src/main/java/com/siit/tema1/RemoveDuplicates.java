package com.siit.tema1;


import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] sir = {20, 20, 30, 40, 50, 50, 50, 20};
        Arrays.sort(sir);
        System.out.println(Arrays.toString(sir));
        int lungime = sir.length;
        int b = lungime;
        System.out.println("lungime = " + lungime);
        if (lungime == 0 || lungime == 1) {
            System.out.println(Arrays.toString(sir));
        }
        for (int i = 0; i <= lungime - 2; i++) {
            if (sir[i] == sir[i + 1]) {
                b = b - 1;
            }


        }
        System.out.println("lungimea sirului fara duble este  " + b);
        int[] faraduble = new int[b];

        int k = 0;
        for (int i = 0; i <= lungime - 2; i++) {
            if (sir[i] != sir[i + 1]) {
                faraduble[k] = sir[i];
                k++;
                faraduble[b-1] = sir[lungime-1];


            }

        }
        System.out.println("Array fara duble este " +Arrays.toString(faraduble));


    }
}






        


