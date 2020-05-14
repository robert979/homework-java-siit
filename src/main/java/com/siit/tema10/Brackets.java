package com.siit.tema10;

public class Brackets {
    static String str1 = "[{()]}";
    static String str2 = "abc{[()]}";
    static String str3 = "";

    static void checkBrackets(String str) {
        String brackets = "{[()]}";
        int roundBracket = 0;
        int squareBracket = 0;
        int braces = 0;
        if (str.length() > 0) {
            for (int i = 0; i <= str.length() - 1; i++) {
                if (!brackets.contains((String.valueOf(str.charAt(i))))) {
                    braces = 1;
                    break;
                } else if (str.charAt(i) == '{') {
                    braces = braces + 1;
                } else if (str.charAt(i) == '}') {
                    braces = braces - 1;
                } else if (str.charAt(i) == '(') {
                    roundBracket = roundBracket + 1;
                } else if ((str.charAt(i)) == ')') {
                    roundBracket = roundBracket - 1;
                } else if (str.charAt(i) == '[') {
                    squareBracket = squareBracket + 1;
                } else if (str.charAt(i) == ']') {
                    squareBracket = squareBracket - 1;
                }


            }
            if (braces == 0 && roundBracket == 0) {
                if (squareBracket == 0) {

                    System.out.println("Yes");
                } else {

                    System.out.println("No");
                }
            } else {

                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }

    }

    static void checkBracketsSwitch(String str) {
        String brackets = "{[()]}";
        int roundBracket = 0;
        int squareBracket = 0;
        int braces = 0;
        if (str.length() > 0) {
            for (int i = 0; i <= str.length() - 1; i++) {
                if (!brackets.contains((String.valueOf(str.charAt(i))))) {
                    braces = 1;
                    break;

                } else {

                    switch (str.charAt(i)) {
                        case '{':
                            braces = braces + 1;
                            break;
                        case '}':
                            braces = braces - 1;
                            break;
                        case '(':
                            roundBracket = roundBracket + 1;
                            break;
                        case ')':
                            roundBracket = roundBracket - 1;
                            break;
                        case '[':
                            squareBracket = squareBracket + 1;
                            break;
                        case ']':
                            squareBracket = squareBracket - 1;
                            break;
                    }
                }


            }
            if (braces == 0 && roundBracket == 0) {
                if (squareBracket == 0) {

                    System.out.println("Yes");
                } else {

                    System.out.println("No");
                }
            } else {

                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }

    }

    public static void main(String[] args) {
        checkBrackets(str1);
        checkBrackets(str3);
        checkBracketsSwitch(str1);
        checkBracketsSwitch(str3);
        checkBracketsSwitch(str2);
    }
}
