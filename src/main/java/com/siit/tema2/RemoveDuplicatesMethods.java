package com.siit.tema2;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesMethods {
    public static void main(String... args) {
        int[] arr = {10, 5, 5, 80, 70, 60, 90, 10, 100, 50, 50, 50, 30};
        System.out.println("sirul initial este    " + Arrays.toString(arr));
        removeDuplicates(arr);
    }

    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        System.out.println("sirul sortat este     " + Arrays.toString(arr));
        int l = arr.length;
        int[] faradublet = new int[l];
        int counter = -1;

        for (int i = 0; i <= l - 2; i++) {
            if (arr[i] != arr[i + 1]) {
                counter = counter + 1;

                faradublet[counter] = arr[i];

            }

        }
        faradublet [counter+1] = arr[l-1];
        //System.out.println("modificat " + Arrays.toString(faradublet));
        //System.out.println(counter);
        int[] arrfinal = new int[counter+2];
        for (int f = 0; f <= counter + 1; f++) {
            arrfinal[f] = faradublet[f];
        }


            System.out.println("sirul fara duble este " + Arrays.toString(arrfinal));
            return arrfinal;
        }


}

