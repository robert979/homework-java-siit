package com.siit.tema4;

import java.util.ArrayList;
import java.util.Arrays;

public class StringManipulation {
    public static void main(String... args) {

        String str = "ammmannaaakk";
        String str1 = "cikedhvrnvkfjeknkndncdolfjeerlkc";
        String str2 = "aabbcbbaa";
        String str3 = "acacacac";
        String str4 = "CAcacaca";
        String str5 = "123587894454";
        String str6 = "a014894548545417";
        String str7 = "aabbcddeffjkjk";
        String str8 = "    astazi e ziua     ta   norocoasa ca asa am zis eu    ";
        char givenChar = 'a';

        String str9 = "abcdef";
        String str10 = "efabcd";

        //reverseString(str);
        //checkPalindrome(str2);
        //checkIfAnagram(str3,str4);
        countChar(str, givenChar);
        //removeChar(str,givenChar);
        //checkIfOnlyDigits(str6);
        //findPrintDuplicates(removeDuplicates(str5));
        //removeDuplicates(str3);
        //findFirstNonRepetedCharacter(str8);
        //reverseWordsOrder(str8);
        //removeUnnecesarySpaces(reverseWordsOrder(str8));
        //checkLongestPalindrom(str);
        //findAllSubstrings(str);
        //findBiggestPalindrom(str);
        //checkStringsRotation(str9, str10);

    }

    private static void checkStringsRotation(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();

        String strCompare = str1.substring(1);


        if (l1 == l2) {
            if (!str1.equals(str2)) {
                for (int i = 0; i <= l1 - 2; i++) {
                    strCompare = strCompare + str1.substring(i, i + 1);
                    if (strCompare.substring(i).equals(str2)) {
                        System.out.println("sirul [" + str1 + "] este o rotatie a sirului [" + str2 + "], si se obtine prin permutarea a " + (i + 1) + " elemente");
                        break;

                    }


                }

            } else {
                System.out.println("cele doua siruri sunt identice");
            }

        } else {

            System.out.println("cele doua siruri au lungimi diferite");
        }

    }


    private static void findBiggestPalindrom(String str) {
        ArrayList<String> newString = new ArrayList();
        ArrayList<String> strWithPalindrom = new ArrayList<>();
        int l = str.length();
        for (int i = 0; i <= l - 1; i++) {
            for (int j = 0; j <= l - i - 1; j++) {
                newString.add(str.substring(i, j + i + 1));
                //System.out.println(str.substring(i, j + i + 1));
            }
        }
        int ll = newString.size();
        for (int i = 0; i <= ll - 1; i++) {
            newString.get(i);


            int bbbbb = newString.get(i).length();
            String palindromCheck1 = newString.get(i).substring(bbbbb - 1);
            for (int j = bbbbb - 1; j >= 1; j--) {
                palindromCheck1 = palindromCheck1 + newString.get(i).substring(j - 1, j);
            }

            if (palindromCheck1.equals(newString.get(i))) {
                strWithPalindrom.add(newString.get(i));
                //System.out.println("Sirul [" +newString.get(i) + "] este un palindrom");

            }

        }
        int counter = 0;

        for (int i = 0; i <= strWithPalindrom.size() - 1; i++) {
            if (counter < strWithPalindrom.get(i).length()) {
                counter = i;
            }
        }
        if (counter > 1) {
            System.out.println("cel mai mare si primul palindrom (de aceasta marime) care apare in sirul [" + str + "]\neste [" + strWithPalindrom.get(counter) + "]");
        } else {
            System.out.println("Sirul [" + str + "] nu contine niciun palindrom");
        }


    }

    private static void findAllSubstrings(String str) {

        int l = str.length();
        if (l > 1) {
            for (int i = 0; i <= l - 1; i++) {
                for (int j = 0; j <= l - i - 1; j++) {

                    System.out.println(str.substring(i, j + i + 1));
                }
            }

        } else {
            System.out.println("Sirul trebuie sa contina minin 2 elemente");
        }

    }


    /*int lungime = str.length();
        String temp = str;
        String temp1 = str;
        String temp2 = new String();
        String temp3 = new String();

        for (int p = 0; p<=lungime-2; p++){
            temp = temp.substring(0,((lungime-p)-1));
            temp1 = temp1.substring(1);
            temp2=temp.substring(1);
            int lungimeintermediara = temp1.length();
            if (lungimeintermediara>1){
                temp3=temp1.substring(0,lungimeintermediara-2);
               }

            System.out.println("temp  "+temp + " lungimea sirului este " + temp.length() );
            System.out.println("temp1 "+temp1 + " lungimea sirului este " + temp1.length());
            System.out.println("temp2 " + temp2 + " lungimea sirului este " + temp2.length());
            System.out.println("temp3 " + temp3 + " lungimea sirului este " + temp3.length());
            System.out.println("lungimeintermediara " + lungimeintermediara);
            //temp1=temp.substring(0,lungime-1);
           //System.out.println("string initial " + str + "\ntemp " + temp + "\ntemp1 " + temp1);




        }



    }
 */
    private static String checkLongestPalindrom(String str) {
        String bigestPalindrome = new String();
        String temp = new String();
        int l = str.length();

        for (int j = 0; j <= l - 1; j++) {
            temp = str.substring(j);
            int b = temp.length();
            String palindromCheck = temp.substring(b - 1);
            for (int i = b - 1; i >= 1; i--) {
                palindromCheck = palindromCheck + temp.substring(i - 1, i);
            }

            if (palindromCheck.equals(temp)) {
                System.out.println("Subsirul [" + temp + "] este cel mai mare palindrom gasit in sirul [" + str + "]");
                break;
            }
        }


        return bigestPalindrome;
    }

    private static String removeUnnecesarySpaces(String str8) {
        String strWithoutSpaces = new String();
        int count = 0;
        strWithoutSpaces = str8.trim();
        int l = strWithoutSpaces.length();
        for (int i = 0; i <= l - 1; i++) {
            if (strWithoutSpaces.charAt(i) == ' ') {
                count += 1;
            }
        }
        for (int i = 0; i < (count / 2); i++) {
            strWithoutSpaces = strWithoutSpaces.replace("  ", " ");
        }
        System.out.println("[" + str8 + "] devine dupa scoaterea spatiilor nenecesare \n[" + strWithoutSpaces + "]");


        return strWithoutSpaces;
    }

    private static String reverseWordsOrder(String str8) {
        String strSpaceRemoved = str8.trim();
        String reversedWords = new String();
        int count = 0;
        int l = strSpaceRemoved.length();
        for (int i = 0; i <= l - 1; i++) {
            if (strSpaceRemoved.charAt(i) == ' ') {
                count = count + 1;
            }
        }

        String[] strColector = new String[count + 1];
        String temp = strSpaceRemoved;

        for (int j = 0; j <= count - 1; j++) {
            strColector[j] = temp.substring(temp.lastIndexOf(" "));
            temp = temp.substring(0, temp.lastIndexOf(" "));


        }
        strColector[count] = strSpaceRemoved.substring(0, strSpaceRemoved.indexOf(" "));


        for (int i = 0; i <= count - 1; i++) {
            reversedWords = reversedWords + strColector[i];

        }
        reversedWords = reversedWords + " " + strColector[count];
        reversedWords = reversedWords.trim();

        System.out.println("[" + str8 + "] in urma inversarii cuvintelor devine \n[" + reversedWords + "]");


        return reversedWords;

    }

    private static void findFirstNonRepetedCharacter(String str) {

        int l = str.length();
        for (int i = 1; i <= l - 1; i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.println("primul caracter unic din sirul [" + str + "] este " + "\"" + str.charAt(i) + "\"");
                break;
            }

        }


    }

    private static String removeDuplicates(String str) {
        String withoutDuplicates = new String();
        char[] wihDuplicates = str.toCharArray();
        Arrays.sort(wihDuplicates);
        int l = wihDuplicates.length;


        for (int i = 0; i <= l - 2; i++) {
            if (wihDuplicates[i] != wihDuplicates[i + 1]) {
                withoutDuplicates = withoutDuplicates + wihDuplicates[i];
            }

        }
        withoutDuplicates = withoutDuplicates + wihDuplicates[l - 1];
        System.out.println("Sirul [" + str + "] din care s-au scos duplicatele, a devenit [" + withoutDuplicates + "]");
        return withoutDuplicates;
    }

    private static String findPrintDuplicates(String str) {
        char[] withDuplicates = str.toCharArray();
        Arrays.sort(withDuplicates);
        int l = withDuplicates.length;
        String onlyDuplicates = new String();
        for (int i = 0; i <= l - 2; i++) {
            if (withDuplicates[i] == withDuplicates[i + 1]) {
                onlyDuplicates = onlyDuplicates + withDuplicates[i];
            }

        }
        System.out.println("duplicatele din sirul [" + str + "] sunt " + onlyDuplicates);
        return onlyDuplicates;

    }

    private static void checkIfOnlyDigits(String str) {
        int l = str.length();
        System.out.println("l este " + l);
        int count = 0;
        String digitArray = "1234567890";
        if (digitArray.contains(str.substring(l - 1))) {
            for (int i = 0; i <= l - 2; i++) {
                if (digitArray.contains(str.substring(i, i + 1))) {

                    count += 1;
                }


                //System.out.println("count este " + count);
            }

        }

        if (count == l - 1) {
            System.out.println("sirul [" + str + "] contine doar cifre");
        } else {
            System.out.println("sirul [" + str + "] NU contine doar cifre");
        }

    }

    private static String removeChar(String str, char givenChar) {
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


    private static int countChar(String str, char givenChar) {
        int l = str.length();
        int count = 0;
        for (int j = 0; j <= l - 1; j++) {
            if (givenChar == str.charAt(j)) {
                count += 1;
            }
        }
        System.out.println("caracterul \"" + givenChar + "\" apare de " + count + " ori in sirul [" + str + "]");
        return count;

    }

    private static void checkIfAnagram(String str, String str1) {
        char[] char1 = str.toLowerCase().toCharArray();
        char[] char2 = str1.toLowerCase().toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        int l1 = char1.length;
        int l2 = char2.length;
        String string1 = new String();
        String string2 = new String();
        for (int i = 0; i <= l1 - 1; i++) {
            string1 = string1 + char1[i];
        }

        for (int i = 0; i <= l2 - 1; i++) {
            string2 = string2 + char2[i];
        }
        if (string1.equals(string2)) {
            System.out.println("Sirul " + str + " este o anagrama a sirului " + str1);
        } else {
            System.out.println("Sirul " + str + " nu este o anagrama a sirului " + str1);
        }
    }

    private static String checkPalindrome(String str) {

        int b = str.length();
        String palindromCheck = str.substring(b - 1);
        for (int i = b - 1; i >= 1; i--) {
            palindromCheck = palindromCheck + str.substring(i - 1, i);
        }

        if (palindromCheck.equals(str)) {
            System.out.println("Sirul [" + str + "] este un palindrom");
        }

        return palindromCheck;
    }
    /*
    private static String printDuplicates(String str){
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

    private static String reverseString(String str) {
        int b = str.length();
        String strrev = str.substring(b - 1);

        for (int i = b - 1; i > 0; i--) {
            strrev = strrev + str.substring(i - 1, i);
        }
        System.out.println("Inversul sirului [" + str + "] este [" + strrev + "]");

        return strrev;
    }
}
