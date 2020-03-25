package com.siit.tema4;

public class StringManipulation {
    public static void main(String[] args) {

        String str= "afrgrgtrttthbththbtht";
        String str1 ="aaaaaabbbbbbccccc";

        reverseString(str);
        reverseString(str1);
    }

    public static String reverseString (String str){
        int b = str.length();
        java.lang.String strrev = str.substring(b - 1);
        System.out.println("prima " + strrev);
        for (int i = b - 1; i >0; i--) {
            strrev = strrev + str.substring(i - 1, i );
        }
        System.out.println(strrev);

        return strrev;
            }
}
