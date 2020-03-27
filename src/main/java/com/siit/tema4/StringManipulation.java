package com.siit.tema4;

import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {

        String str= "aabbcaaabbaa";
        String str1 ="cikedhvrnvkfjeknkndncdolfjeerlkc";
        String str2 = "aabbcbbaa";
        String str3 = "acacacac";
        String str4 = "CAcacaca";
        String str5 = "123587894454";
        String str6 = "a014894548545417";
        String str7 = "aabbcddeffjkjk";
        String str8 = "astazi e ziua tas";
        char givenChar = 'a';

        //reverseString(str);
        //checkPalindrome(str2);
        //checkIfAnagram(str3,str4);
        //countChar(str, givenChar);
        //removeChar(str,givenChar);
        //checkIfOnlyDigits(str6);
        //findPrintDuplicates(removeDuplicates(str5));
        //removeDuplicates(str3);
        findFirstNonRepetedCharacter(str8);
        }
        //public static String reverseWordsOrder (String str8){
        //int l = str8.length();

        //for

       // }

        public static void findFirstNonRepetedCharacter (String str){

        int l = str.length();
        for (int i=1; i<=l-1; i++){
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.println("primul caracter unic din sirul [" + str + "] este " + "\"" + str.charAt(i) + "\"");
                break;
            }

        }


        }
        public static String removeDuplicates (String str){
        String withoutDuplicates = new String();
        char [] wihDuplicates = str.toCharArray();
        Arrays.sort(wihDuplicates);
        int l = wihDuplicates.length;


       for (int i = 0; i<=l-2; i++){
           if (wihDuplicates[i]!= wihDuplicates[i+1]){
               withoutDuplicates = withoutDuplicates + wihDuplicates[i];
           }

       }
            withoutDuplicates = withoutDuplicates + wihDuplicates[l-1];
            System.out.println("Sirul [" + str + "] din care s-au scos duplicatele, a devenit [" + withoutDuplicates + "]");
        return withoutDuplicates;
        }

    public static String findPrintDuplicates (String str){
        char [] withDuplicates=str.toCharArray();
       Arrays.sort(withDuplicates);
       int l = withDuplicates.length;
       String onlyDuplicates=new String();
       for (int i=0; i<=l-2;i++){
           if (withDuplicates[i] == withDuplicates[i+1] ){
               onlyDuplicates=onlyDuplicates+withDuplicates[i];
           }

       }
       System.out.println("duplicatele din sirul [" +str + "] sunt " + onlyDuplicates);
       return onlyDuplicates;

    }
    public static void checkIfOnlyDigits (String str) {
        int l = str.length();
        System.out.println("l este " + l);
        int count = 0;
        String digitArray = "1234567890";
        if (digitArray.contains(str.substring(l-1))) {
            for (int i = 0; i <= l - 2; i++) {
                if (digitArray.contains(str.substring(i, i + 1))) {

                    count += 1;
                }


                //System.out.println("count este " + count);
            }

        }

        if (count == l - 1) {
            System.out.println("sirul [" + str + "] contine doar cifre");
        }

        else {
            System.out.println("sirul [" + str + "] NU contine doar cifre");
        }

        }

        public static String removeChar (String str,char givenChar){
            String strRemoveChar = new String();
            int l = str.length();
            for (int i = 0; i <= l - 1; i++) {
                if (givenChar != str.charAt(i)) {
                    strRemoveChar = strRemoveChar + str.charAt(i);
                }
            }
            System.out.println("Prin eliminarea caracterului \"" + givenChar + "\" sirul [" + str + "] a devenit [" + strRemoveChar + "]");

            return strRemoveChar;
        }


     public static int countChar (String str, char givenChar){
        int l = str.length();
        int count = 0;
        for (int j =0; j<= l-1; j++){
            if (givenChar == str.charAt(j)){
                count +=1;
               }
        }
         System.out.println("caracterul \"" + givenChar + "\" apare de " + count + " ori in sirul [" + str + "]");
        return count;

     }

    public static void checkIfAnagram (String str, String str1){
        char [] char1= str.toLowerCase().toCharArray();
        char [] char2 = str1.toLowerCase().toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        int l1 = char1.length;
        int l2 = char2.length;
        String string1 = new String();
        String string2 = new String();
        for (int i=0; i<=l1-1; i++){
            string1 = string1+ char1[i];
            }

        for (int i=0; i<=l2-1; i++) {
            string2 = string2 + char2[i];
        }
        if (string1.equals(string2)){
            System.out.println("Sirul " + str + " este o anagrama a sirului " + str1);
        }
        else {
            System.out.println("Sirul " + str + " nu este o anagrama a sirului " + str1);
        }
    }

    public static String checkPalindrome (String str){

        int b = str.length();
        String palindromCheck = str.substring(b-1);
        for (int i = b-1; i >= 1; i--){
            palindromCheck=palindromCheck+str.substring(i-1,i);
        }

        if (palindromCheck.equals(str)){
            System.out.println("Sirul [" + str + "] este un palindrom");
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
        String strrev = str.substring(b - 1);

        for (int i = b - 1; i >0; i--) {
            strrev = strrev + str.substring(i - 1, i );
        }
        System.out.println("Inversul sirului [" + str + "] este [" + strrev + "]");

        return strrev;
            }
}
