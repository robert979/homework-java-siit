package com.siit.tema2;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySmallestMethod {
    public static void main (String ... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti lungimea sirului ");
        int l=input.nextInt();
        int [] arr= new int[l];
        for (int i= 0; i<= l-1; i++){
            System.out.println("Introduceti elementul cu numarul " + (i+1)+ " al sirului");
            arr[i]=input.nextInt();

        }
        System.out.println("Sirul este" + Arrays.toString(arr));
        findMin(arr);
    }
    public static void findMin(int [] arr){
        Arrays.sort(arr);
        System.out.println("Cel mai mic numar as sirului este " + arr[0]);

    }

}
