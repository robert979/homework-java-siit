package com.siit.tema2;

import java.util.Arrays;
import java.util.Scanner;

public class StringDuplicates {
    public static void main (String ... args){
        Scanner caractere= new Scanner(System.in);
        System.out.println("Inroduceti sirul de caractere;" );
        String sir = caractere.nextLine();
        System.out.println("Sirul este \n" + sir);
       printDuplicates(sir);
       removeDuplicates(sir);

    }
    public static String printDuplicates(String sir){
        char [] arr = sir.toCharArray();
        Arrays.sort(arr);
        System.out.println("Sirul sortat este \n" + Arrays.toString(arr));
        int l= arr.length;
        String duble= "[";
        if (arr[0] == arr [1]){
            duble=duble + arr[0] + ", ";
        }
        for (int i=1; i<=l-2; i++){
            if (arr[i]==arr[i+1]&&arr[i]!=arr[i-1]){
                duble = duble+ arr[i] + ", ";
            }
        }
        duble= duble+ "]";

        System.out.println("Sirul caracterelor duble este \n" + duble);

        return duble;
    }
    public static String removeDuplicates(String sir){
        char [] arr = sir.toCharArray();
        Arrays.sort(arr);
        int l= arr.length;
        String faraduble = "[";
        for (int i=0; i<=l-2;i++) {
            if (arr [i] != arr[i+1]){
                faraduble = faraduble + arr[i]+", ";
            }

        }

        faraduble = faraduble + arr[l-1] + "]";
        System.out.println("Sirul fara caractere duble este \n" + faraduble);
        

        return faraduble;
    }
}
