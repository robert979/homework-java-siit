package com.siit.firstquiz;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ShapeAreaPerimeter3 {
    public static void main (String[] args){
        ArrayList<String> squareArrList = new ArrayList<>();
        String answerGen = "yes";
        String allOptions = "1234";
        String digitsOnly ="0123456789";
        boolean onlyDigits=true;


        Scanner input = new Scanner(System.in);
        System.out.println("This is an aplication that can calculate the area and the perimeter for the following shapes:\n" +
                "1 - square\n" +
                "2 - circle\n" +
                "3 - rectangle\n" +
                "4 - triangle\n" +
                "So please chose for which of the described shapes you want to run the app");
        String answer = input.next().toLowerCase();
        if (allOptions.contains(answer)){
            if (answer.equals("1")){
                System.out.println("For the square please input the side value (mm) ");
                String squareSide = input.next();
                String squareSideMod = squareSide + "\uF04A";
                for (int i =0; i<=squareSide.length()-2; i++){
                    if (digitsOnly.contains(squareSideMod.substring(i, i+1))){
                        onlyDigits = true;
                    }
                    else {
                        onlyDigits = false;
                        break;
                    }
                }
                if (onlyDigits == true){
                    calculateSquare(squareSide);
                    squareArrList.add(squareSide);


                }
                else{
                    System.out.println("Wrong, please rerun the app and use only digits");
                    answerGen = "";
                }

                while (answerGen.equals("yes")) {
                    System.out.println("Do you want to add a new square ?");
                    answer = input.next().toLowerCase();
                    if (answer.equals("yes")) {
                        System.out.println("For the square please input the side value (mm) ");
                         squareSide = input.next();
                        squareSideMod = squareSide + "\uF04A";
                        for (int i = 0; i <= squareSide.length() - 2; i++) {
                            if (digitsOnly.contains(squareSideMod.substring(i, i + 1))) {
                                onlyDigits = true;
                            } else {
                                onlyDigits = false;
                                break;
                            }
                        }
                        if (onlyDigits == true) {
                            if (squareArrList.contains(squareSide)) {
                                System.out.println("This square was already checked, do you want to check another ?");
                                answerGen = input.next();}
                                else{

                                calculateSquare(squareSide);
                                squareArrList.add(squareSide);
                            }
                            }


                        } else {
                            System.out.println("Wrong, please rerun the app and use only digits");
                            answerGen = "";

                        }
                    }
                }




            }//if1
        }//ifalloption



    public static String calculateSquare(String sideLengthStr) {
        int countSide = 0;
        long sideLength = 0;
        String numStr = "0123456789";








        String sideLengthStrmod = sideLengthStr + "\uF04A";
        for (int i = 0; i <= sideLengthStrmod.length() - 2; i++) {
            if (numStr.contains(sideLengthStrmod.substring(i, i + 1))&&!sideLengthStr.equals("0")) {
                countSide = countSide + 1;

            } else {
                System.out.println("Input error - you should use only digits, with the value greater then zero.\n" +
                        "Please rerun the application.");
                break;
            }


        }
        if (countSide == sideLengthStr.length()) {

            for (int j = sideLengthStrmod.length() - 1; j >= 1; j--) {
                sideLength = sideLength + (long) (Math.pow(10, (sideLengthStrmod.length() - (j + 1))) * parseInt(sideLengthStrmod.substring(j - 1, j)));

            }
            calculateSquareArea(sideLength);
            calculateSqurePerimeter(sideLength);
        }
        return sideLengthStr;

    }


    /*
    public static String calculateSquare() {
        int countSide = 0;
        long sideLength = 0;
        String numStr = "0123456789";

        Scanner input = new Scanner(System.in);

        System.out.println("For the square please input the side value (mm) ");


        String sideLengthStr = input.nextLine();

        String sideLengthStrmod = sideLengthStr + "\uF04A";
        for (int i = 0; i <= sideLengthStrmod.length() - 2; i++) {
            if (numStr.contains(sideLengthStrmod.substring(i, i + 1))&&!sideLengthStr.equals("0")) {
                countSide = countSide + 1;

            } else {
                System.out.println("Input error - you should use only digits, with the value greater then zero.\n" +
                        "Please rerun the application.");
                break;
            }


        }
        if (countSide == sideLengthStr.length()) {

            for (int j = sideLengthStrmod.length() - 1; j >= 1; j--) {
                sideLength = sideLength + (long) (Math.pow(10, (sideLengthStrmod.length() - (j + 1))) * parseInt(sideLengthStrmod.substring(j - 1, j)));

            }
            calculateSquareArea(sideLength);
            calculateSqurePerimeter(sideLength);
        }
        return sideLengthStr;

    }
*/


    public static long calculateSquareArea(long sideLength) {
        long squareArea = (long) Math.pow(sideLength, 2);
        System.out.println("for the given square side = " + sideLength + " mm\n" +
                "area = " + squareArea + " square mm");
        return squareArea;

    }

    public static Long calculateSqurePerimeter(long sideLength) {
        long squarePerimetter = 4 * sideLength;
        System.out.println("perimeter = " + squarePerimetter + " mm");
        return squarePerimetter;
    }
}
