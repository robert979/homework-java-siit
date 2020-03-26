package com.siit.tema4;

public class StringManipulation {
    public static void main(String[] args) {

        String str= "aabbcbbaa";
        String str1 ="aaaaaabbbbbbccccc";
        String str2 = "aabbcbbaa";


        reverseString(str);
        printDuplicates(str);
        checkAnagram(str);
        checkAnagram(str2);
    }

    public static String checkAnagram (String str){

        int b = str.length();
        String anagramCheck = str.substring(b-1);
        for (int i = b-1; i >= 1; i--){
            anagramCheck=anagramCheck+str.substring(i-1,i);
        }
        System.out.println(anagramCheck);
        if (anagramCheck.equals(str)){
            System.out.println(str + " este o anagrama");
        }

        return anagramCheck;
    }
    public static String printDuplicates(String str){
        String duplicates = new String();
        int b = str.length();
        for (int i =0; i<=b-3;i++ ){
            for (int j = i+1; j<=b-2; j++){
                if (str.substring(i,i+1)==str.substring(j,j+1)){
                    System.out.println(str.substring(i,i+1));
                    duplicates = duplicates+ str.substring(i,i+1);

                }
            }
        }
        System.out.println("duplicates " + duplicates);


        return duplicates;
        }

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
