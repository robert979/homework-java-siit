package com.siit.tema7;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pentru operatia de impartire dintre doua numere intregi X/Y, va rog introduceti X");
        String strX = input.next();
        System.out.println("introduceti y");
        String strY = input.next();
        String strYY = strY + " ";
        String strXX = strX + " ";
        long x = 0;
        long y = 0;
        boolean flag = true;
        for (int i = 0; i <= strX.length() - 1; i++) {

            if (!"0123456789".contains(strXX.substring(i, i + 1))) {
                System.out.println("java.util.InputMismatchException");
                flag = false;
                break;
            }
        }
        if (flag) {
            for (int j = 0; j <= strY.length() - 1; j++) {
                if (!"0123456789".contains(strYY.substring(j, j + 1))) {
                    System.out.println("java.util.InputMismatchException");
                    flag = false;
                    break;
                }
            }

        }


        if (flag) {
            for (int i = strX.length(); i >= 1; i--) {
                x = x + (long) (Math.pow(10, (strXX.length() - (i + 1))) * Integer.parseInt(strXX.substring(i - 1, i)));
            }
            for (int j = strY.length(); j >= 1; j--) {
                y = y + (long) (Math.pow(10, (strYY.length() - (j + 1))) * Integer.parseInt(strYY.substring(j - 1, j)));
            }

            if (x == (int) x && y == (int) y) {

                if (y > 0) {
                    System.out.println(x / y);
                } else {
                    System.out.println("java.lang.ArithmeticException: / by zero");
                }

            } else {
                System.out.println("java.util.InputMismatchException");
            }

        }
    }
}

       /* if (Integer.parseInt(strX) == (int) Integer.parseInt(strX)) {
            System.out.println("introduceti Y");
            String strY=input.next();
            if (Integer.parseInt(strY)==(int)Integer.parseInt(strY)){
                if (Integer.parseInt(strY)>0){
                    System.out.println( Integer.parseInt(strX)/Integer.parseInt(strY));

                }else {
                    throw new ArithmeticException("by zero");
                }


            }else {
                throw new InputMismatchException("java.util.InputMismatchException");
            }

        } else {
            throw new InputMismatchException("java.util.InputMismatchException");
        }
    }

        */

