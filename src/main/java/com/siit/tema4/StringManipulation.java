package com.siit.tema4;

import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {

        String str= "aabbcbbaa";
        String str1 ="cikedhvrnvkfjeknkndncdolfjeerlkc";
        String str2 = "aabbcbbaa";
        String str3 = "acacacac";
        String str4 = "cacacaca";


        reverseString(str);
        checkPalindrome(str);
        checkPalindrome(str2);
        checkIfAnagram(str3,str4);
    }

    public static void checkIfAnagram (String str, String str1){
        char [] char1= str.toCharArray();
        char [] char2 = str1.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        int l1 = char1.length;
        int l2 = char2.length;
        String string1 = new String();
        String string2 = new String();
        for (int i=0; i<=l1-1; i++){
            string1 = string1+ char1[i];
            }
        for (int i=0; i<=l2-1; i++){
            string2 = string2+ char2[i];
        }
        if (string1.equals(string2)){
            System.out.println("Sirul " + str + " este o anagrama a sirului " + str1);
        }



    }

    public static String checkPalindrome (String str){

        int b = str.length();
        String palindromCheck = str.substring(b-1);
        for (int i = b-1; i >= 1; i--){
            palindromCheck=palindromCheck+str.substring(i-1,i);
        }
        System.out.println(palindromCheck);
        if (palindromCheck.equals(str)){
            System.out.println("Sirul " + str + " este un palindrom");
        }

        return palindromCheck;
    }
    /*
    public static String printDuplicates(String str){
        String duplicates = new String();
        int b = str.length();
        for (int i =0; i<=b-3;i++ ){
            for (int j = i+1; j<=b-2; j++){
                if (str.substring(i,i+1).equals(str.substring(j,j+1))){
                    System.out.println(str.substring(i,i+1));
                    duplicates = duplicates+ str.substring(i,i+1);

                }
            }
        }
        System.out.println("duplicates " + duplicates);


        return duplicates;
        }
        */

    public static String reverseString (String str){
        int b = str.length();
        java.lang.String strrev = str.substring(b - 1);
        System.out.println("prima " + strrev);
        for (int i = b - 1; i >0; i--) {
            strrev = strrev + str.substring(i - 1, i );
        }
        System.out.println("Reverse String " + strrev);

        return strrev;
            }
}
