//01 Write a method to reverse a given string in place.
//02 Write a method to print duplicate characters from a string.
//03 Write a method to check if two strings are anagrams of each other.
//04 Write a method to find all the permutations of a string.
//05 Write a method to check if a string contains only digits.
//06 Write a method to find duplicate characters in a given string.
//07 Write a method to count a number of vowels and consonants in a given string.
//08 Write a method to count the occurrence of a given character in a string.
//09 Write a method to print the first non-repeated character from a string.
//10 Write a method to convert a given String into int like the atoi().
//11 Write a method to reverse words in a given sentence without using any library method.
//12 Write a method to check if two strings are a rotation of each other.
//13 Write a method to check if a given string is a palindrome.
//14 Write a method to find the length of the longest substring without repeating characters.
//15 Given string str, write a method to find the longest palindromic substring in str.
//16 Write a method to remove the duplicate character from String.
//17 Write a method to remove a given character from String.
//18 Given an array of strings, find the most frequent word in a given array, I mean, the string

package com.siit.tema5.string;

import java.util.ArrayList;
import java.util.Arrays;

public class StringManipulationToBeTested {

    private static char findFirstNonRepetedCharacter(String str) {

        int l = str.length();
        int j =0;
        for (int i = 1; i <= l - 1; i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.println("primul caracter unic din sirul [" + str + "] este " + "\"" + str.charAt(i) + "\"");
                j=i;
                break;
            }

        }
        return str.charAt(j);


    }

    public static String removeDuplicates(String str) {
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
        String palindromCheck = new String();
        if (b > 0) {
            palindromCheck = str.substring(b - 1);


            for (int i = b - 1; i >= 1; i--) {
                palindromCheck = palindromCheck + str.substring(i - 1, i);
            }

            if (palindromCheck.length() > 1) {

                if (palindromCheck.equals(str)) {
                    System.out.println("Sirul [" + str + "] este un palindrom");
                } else {
                    System.out.println("Sirul [" + str + "], nu este un palindrom");
                }

            } else {
                System.out.println("Sirul [" + str + "], nu este un palindrom");
            }
        } else {
            System.out.println("Sirul [] este gol");
        }

        return palindromCheck;
    }

    private static String reverseString(String str) {
        int b = str.length();
        String strrev = str.substring(b - 1);

        for (int i = b - 1; i > 0; i--) {
            strrev = strrev + str.substring(i - 1, i);
        }
        System.out.println("Inversul sirului [" + str + "] este [" + strrev + "]");

        return strrev;
    }

    void convertStringToInt(String str) {
        String strNumbers = "0123456789";
        int a = 0;
        int b = 0;
        for (int i = 0; i <= str.length() - 1; i++) {

            for (int j = 0; j <= strNumbers.length() - 1; j++) {
                if (str.charAt(i) == strNumbers.charAt(j)) {
                    a = (a * 10) + j;
                    b += 1;


                }
            }
        }
        String onlyNumbers = String.valueOf(a);

        if (str.length() > 0) {
            if (b > 0) {

                System.out.println("Sirul [" + str + "] contine int " + a);

            } else {
                System.out.println("Sirul [" + str + "] nu contine niciun int");
            }

        } else {
            System.out.println("Sirul [" + str + "] este nul");
        }

    }

    void countVowelsAndConsonants(String str) {
        int c = 0;
        int v = 0;
        int y = 0;
        String consoane = new String();
        String vocale = new String();
        String yyy = new String();
        String str1 = str + " ";
        char[] strChar = str.toCharArray();
        String vowels = "AEIOUaeiou";
        String consonant = "QWRTYSDFGHJKLZXCVBNMqwrtpsdfghjklzxcvbnm";
        String yy = "Yy";
        int l = str.length();
        for (int i = 0; i <= l - 1; i++) {
            if (vowels.contains(str1.substring(i, i + 1))) {
                v += 1;
                vocale = vocale + str1.substring(i, i + 1);
            }
            if (consonant.contains(str1.substring(i, i + 1))) {
                c += 1;
                consoane = consoane + str1.substring(i, i + 1);
            }
            if (yy.contains(str1.substring(i, i + 1))) {
                y += 1;
                yyy = yyy + str1.substring(i, i + 1);
            }

        }

        if ((c + v + y) > 0) {
            System.out.println("Sirul [" + str + "] contine :");
            if (c > 0) {
                System.out.println("-" + c + " consoane si acestea sunt [" + consoane + "]");
            }
            if (v > 0) {
                System.out.println("-" + v + " vocale si acestea sunt [" + vocale + "]");
            }
            if (y > 0) {
                System.out.println("-litera y de " + y + " ori");
            }
        } else {
            System.out.println("Sirul [" + str + "] nu contine nici vocale, nici consoane nici litera \"y\"");
        }

    }

    void checkStringsRotation(String str1, String str2) {
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

    void findBiggestPalindrom(String str) {
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

    void findAllSubstrings(String str) {

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

    String checkLongestPalindrom(String str) {
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

    String removeUnnecesarySpaces(String str8) {
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

    String reverseWordsOrder(String str8) {
        String reversedWords = new String();
        if (str8.length() != 0) {
            String strSpaceRemoved = str8.trim();

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
        }else {
            System.out.println("Sirul este nul - nu contine niciun caracter");
            reversedWords="";
        }



        return reversedWords;
    }
}
