package com.siit.firstquiz;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ShapeAreaPerimeter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("For these given shapes: triangle, circle, rectangle and square\n" +
                "for how many of them do you want to calculate the area and the perimeter.\n" +
                "-please insert a digit between 1 and 4");
        String numberOption = input.next();
        String option1str = "1234";
        if (option1str.contains(numberOption)) {
            if (numberOption.equals("1")) {

                System.out.println("You pressed 1, this means that you will have to chose only ony shape.\n" +
                        "-please chose the digit coressponding to your option\n" +
                        "1 - square\n" +
                        "2 - rectangle\n" +
                        "3 - circle\n" +
                        "4 - triangle");
                String subOption1 = input.next();
                if (option1str.contains(subOption1)) {
                    if (subOption1.equals("1")) {
                        //System.out.println("You pressed 1, this means that you chossed square/n" +
                        //  "please input the value for square side (mm)");
                        //String sideLengthStr = input.next();
                        calculateSquare();


                    }
                    else if (subOption1.equals("2")){
                        calculateRectangle();

                    }
                }
                else {
                    System.out.println("Wrong input, please re run the aplication and chose a digit from 1 to 4");

                }
            }


        } else {
            System.out.println("Wrong input, please re run the aplication and chose a digit from 1 to 4");


        }
    }
    public static void calculateRectangle(){
        long widthLength = 0;
        long heightLength = 0;

        String numStr = "0123456789";

        Scanner input = new Scanner(System.in);

        System.out.println("You pressed 2, this means that you chossed rectangle\n" +
                "please input the values as follows\n" +
                "width(mm) =  ");

        String widthhStr = input.nextLine();
        String widthStrMod = widthhStr + " ";

        for (int i = 0; i <= widthStrMod.length() - 2; i++) {
            if (!numStr.contains(widthStrMod.substring(i, i + 1))) {
                System.out.println("Input error - you should use only digits\n" +
                        "Please re run the aplication.");
                break;
            }


        }
        for (int j = widthStrMod.length() - 1; j >= 1; j--) {
            widthLength =widthLength + (long) (Math.pow(10, (widthStrMod.length() - (j + 1))) * parseInt(widthStrMod.substring(j - 1, j)));

        }

        System.out.println("height(mm) =");

        String heightStr = input.next();

        String heightStrMod = heightStr + "M";
        System.out.println( "height str " + heightStr);
        System.out.println("height mod "  + heightStrMod);

        for (int i = 0; i <= heightStrMod.length() - 2; i++) {
            if (!numStr.contains(heightStrMod.substring(i, i + 1))) {
                System.out.println("Input error - you should use only digits\n" +
                        "Please re run the aplication.");
                break;
            }

        }
        for (int j = heightStrMod.length() - 1; j >= 1; j--) {
            heightLength =heightLength + (long) (Math.pow(10, (heightStrMod.length() - (j + 1))) * parseInt(heightStrMod.substring(j - 1, j)));

        }
        System.out.println("For the given widtht = " + widthLength + " mm, and height =  " + heightLength + " mm, for a rectangle\n" +
                "the are = " + heightLength*widthLength + " square mm\n" +
                "the perimeter = " + ((widthLength+heightLength)*2) + " mm");



    }



    public static void calculateSquare() {
        long sideLength = 0;
        String numStr = "0123456789";

        Scanner input = new Scanner(System.in);

        System.out.println("You pressed 1, this means that you chossed square\n" +
                "please input the value for square side (mm)");

        String sideLengthStr = input.nextLine();

        String sideLengthStrmod = sideLengthStr + " ";
        for (int i = 0; i <= sideLengthStrmod.length() - 2; i++) {
            if (!numStr.contains(sideLengthStr.substring(i, i + 1))) {
                System.out.println("Input error - you should use only digits\n" +
                        "Please re run the aplication.");
                break;
            }


        }

        for (int j = sideLengthStrmod.length() - 1; j >= 1; j--) {
            sideLength = sideLength + (long) (Math.pow(10, (sideLengthStrmod.length() - (j + 1))) * parseInt(sideLengthStrmod.substring(j - 1, j)));

        }
        calculateSquareArea(sideLength);
        calculateSqurePerimeter(sideLength);

    }


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



