package com.siit.firstquiz;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ShapeAreaPerimeter {

{
            System.out.println("Wrong input, please rerun the aplication and chose a digit from 1 to 4");


        }
        else
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
                        //System.out.println("You pressed 1, this means that you have chosen square/n" +
                        //  "please input the value for square side (mm)");
                        //String sideLengthStr = input.next();
                        calculateSquare();


                    } else if (subOption1.equals("2")) {
                        calculateRectangle();


                    } else if (subOption1.equals("3")) {
                        calculateCircle();

                    } else if (subOption1.equals("4")) {
                        calculateTriangle();

                    } else {
                        System.out.println("Wrong input, please rerun the aplication and chose a digit from 1 to 4");


                    }
                } else {
                    System.out.println("Wrong input, please rerun the aplication and chose a digit from 1 to 4");

                }
            }


        }
        if (numberOption.equals("2")) {

            System.out.println("You pressed 2, this means that you will have to chose only two shape.\n" +
                    "-please chose the digit coressponding to your first option\n" +
                    "1 - square\n" +
                    "2 - rectangle\n" +
                    "3 - circle\n" +
                    "4 - triangle");
            String subOption2 = input.next();
            if (subOption2.equals("1")) {

            }
            }
        }
    }

    public static void calculateTriangle() {
        System.out.println("You pressed 4, this means that you have chosen triangle\n" +
                "-please input the values as follows\n" +
                "1st side(mm) =  ");
        String numStr = "0123456789";
        int countFirstSide = 0;
        int counSecondSide = 0;
        int countThirdSide = 0;
        long firstSide = 0;
        long secondSide = 0;
        long thirsSide = 0;
        String thirdSideStr = "c";
        Scanner input = new Scanner(System.in);


        String firstSideStr = input.next();

        String firstSideStrMod = firstSideStr + "\uF04A";
        for (int i = 0; i <= firstSideStrMod.length() - 2; i++) {
            if (numStr.contains(firstSideStrMod.substring(i, i + 1))) {
                countFirstSide = countFirstSide + 1;
            } else {
                System.out.println("Input error - you should use only digits\n" +
                        "Please rerun the aplication.");
                break;
            }
        }
        if (countFirstSide == firstSideStr.length()) {
            for (int j = firstSideStrMod.length() - 1; j >= 1; j--) {
                firstSide = firstSide + (long) (Math.pow(10, (firstSideStrMod.length() - (j + 1))) * parseInt(firstSideStrMod.substring(j - 1, j)));

            }


        }
        if (countFirstSide == firstSideStr.length()) {
            System.out.println("2nd side(mm) =  ");
            String secondSideStr = input.next();

            String secondtSideStrMod = secondSideStr + "\uF04A";
            for (int i = 0; i <= secondtSideStrMod.length() - 2; i++) {
                if (numStr.contains(secondtSideStrMod.substring(i, i + 1))) {
                    counSecondSide = counSecondSide + 1;
                } else {
                    System.out.println("Input error - you should use only digits\n" +
                            "Please rerun the aplication.");
                    break;
                }
            }
            if (counSecondSide == secondSideStr.length()) {
                for (int j = secondtSideStrMod.length() - 1; j >= 1; j--) {
                    secondSide = secondSide + (long) (Math.pow(10, (secondtSideStrMod.length() - (j + 1))) * parseInt(secondtSideStrMod.substring(j - 1, j)));

                }


            }
            if (counSecondSide == secondSideStr.length()) {


                System.out.println("3rd side(mm) =  ");
               thirdSideStr = input.next();

                String thirdSideStrMod = thirdSideStr + "\uF04A";
                for (int i = 0; i <= thirdSideStrMod.length() - 2; i++) {
                    if (numStr.contains(thirdSideStrMod.substring(i, i + 1))) {
                        countThirdSide = countThirdSide + 1;
                    } else {
                        System.out.println("Input error - you should use only digits\n" +
                                "Please rerun the aplication.");
                        break;
                    }
                }
                if (countThirdSide == thirdSideStr.length()) {
                    for (int j = thirdSideStrMod.length() - 1; j >= 1; j--) {
                        thirsSide = thirsSide + (long) (Math.pow(10, (thirdSideStrMod.length() - (j + 1))) * parseInt(thirdSideStrMod.substring(j - 1, j)));

                    }


                }



            }

            if (countThirdSide == thirdSideStr.length()){
                if (firstSide+secondSide> thirsSide&& firstSide+thirsSide>secondSide){
                    if (secondSide+thirsSide>firstSide){
                        calculateTraingleArea(firstSide, secondSide, thirsSide);
                        calculateTrianglePerimeter(firstSide,secondSide,thirsSide);

                    }
                    else {
                        System.out.println("The values you provided can't give a valid triangle.\n" +
                                "Please rerun the application and assign good values.");
                    }
                }
                else {
                    System.out.println("The values you provided can't give a valid triangle.\n" +
                            "Please rerun the application and assign good values");
                }
            }

        }



    }
    public static long calculateTrianglePerimeter (long firstSide, long secondSide,long thirdSide){
        long perimeter = firstSide+secondSide+thirdSide;
        System.out.println("perimeter = " + perimeter + " mm");
        return perimeter;
    }
    public static double calculateTraingleArea(long firstSide, long secondSide,long thirdSide) {

        double p = (firstSide+secondSide+thirdSide);
        double semiP = p/2;
        System.out.println("p = " +semiP);
        double triangleArea =
                 Math.sqrt(semiP*(semiP-firstSide)*(semiP-secondSide)*(semiP-thirdSide));

        System.out.println("For a triangle with the given sides, as follows: side1 = " + firstSide + " mm, side2 = " +secondSide + " mm, side3 = "
                + thirdSide + " mm,\n" +
                "area = " + triangleArea + " mm");
        return triangleArea;
    }


    public static void calculateCircle() {
        System.out.println("You pressed 3, this means that you have chosen circle\n" +
                "please input the value for circle radius (mm)");

        String numStr = "0123456789";
        int countRadius = 0;
        long radius = 0;
        Scanner input = new Scanner(System.in);


        String radiusStr = input.next();

        String radiusStrMod = radiusStr + "\uF04A";
        for (int i = 0; i <= radiusStrMod.length() - 2; i++) {
            if (numStr.contains(radiusStrMod.substring(i, i + 1))) {
                countRadius = countRadius + 1;
            } else {
                System.out.println("Input error - you should use only digits\n" +
                        "Please rerun the aplication.");
                break;
            }
        }
        if (countRadius == radiusStr.length()) {
            for (int j = radiusStrMod.length() - 1; j >= 1; j--) {
                radius = radius + (long) (Math.pow(10, (radiusStrMod.length() - (j + 1))) * parseInt(radiusStrMod.substring(j - 1, j)));

            }

        }
        if (countRadius == radiusStr.length()) {
            calculateCircleArea(radius);
            calculateCirclePerimeter(radius);
        }



    }

    public static long calculateCircleArea(long radius) {
        long circleArea = (long) (Math.PI * radius * radius);
        System.out.println("for a circle with given radius = " + radius + "mm\n" +
                "area = " + circleArea + " square mm");
        return circleArea;
    }

    public static long calculateCirclePerimeter(long radius) {
        long perimeter = (long) (Math.PI * 2 * radius);
        System.out.println("for a circle with given radius = " + radius + "mm\n" +
                "perimeter = " + perimeter + " square mm");
        return perimeter;

    }

    public static void calculateRectangle() {
        int countWidth = 0;
        int countHeight = 0;
        long widthLength = 0;
        long heightLength = 0;

        String numStr = "0123456789";

        Scanner input = new Scanner(System.in);

        System.out.println("You pressed 2, this means that you have chosen rectangle\n" +
                "please input the values as follows\n" +
                "width(mm) =  ");

        String widthhStr = input.nextLine();
        String widthStrMod = widthhStr + "\uF04A";

        for (int i = 0; i <= widthStrMod.length() - 2; i++) {
            if (numStr.contains(widthStrMod.substring(i, i + 1))) {
                countWidth = countWidth + 1;


            } else {

                System.out.println("Input error - you should use only digits\n" +
                        "Please rerun the aplication.");
                break;
            }
            if (countWidth == widthhStr.length()) {
                for (int j = widthStrMod.length() - 1; j >= 1; j--) {
                    widthLength = widthLength + (long) (Math.pow(10, (widthStrMod.length() - (j + 1))) * parseInt(widthStrMod.substring(j - 1, j)));
                    //se scrie numarul dupa input de String

                }
            }


        }

        if (countWidth == widthhStr.length()) {

            System.out.println("height(mm) =");

            String heightStr = input.next();

            String heightStrMod = heightStr + "\uF04A";


            for (int i = 0; i <= heightStrMod.length() - 2; i++) {
                if (numStr.contains(heightStrMod.substring(i, i + 1))) {
                    countHeight = countHeight + 1;


                } else {
                    System.out.println("Input error - you should use only digits\n" +
                            "Please rerun the aplication.");
                    break;
                }

            }
            if (countHeight == heightStr.length()) {
                for (int j = heightStrMod.length() - 1; j >= 1; j--) {
                    heightLength = heightLength + (long) (Math.pow(10, (heightStrMod.length() - (j + 1))) * parseInt(heightStrMod.substring(j - 1, j)));
                    //se scrie numarul dupa input de String

                }
                System.out.println("For the given widtht = " + widthLength + " mm, and height =  " + heightLength + " mm, for a rectangle\n" +
                        "the area = " + calculateRectangleArea(widthLength, heightLength) + " square mm\n" +
                        "the perimeter = " + calculateRectanglePerimeter(widthLength, heightLength) + " mm");
            }
        }


    }

    public static long calculateRectanglePerimeter(long width, long height) {
        long perimeterRectangle = 2 * (width + height);
        return perimeterRectangle;
    }

    public static long calculateRectangleArea(long width, long height) {
        long areaRectnagle = width * height;
        return areaRectnagle;
    }


    public static void calculateSquare() {
        int countSide = 0;
        long sideLength = 0;
        String numStr = "0123456789";

        Scanner input = new Scanner(System.in);

        System.out.println("You pressed 1, this means that you have chosen square\n" +
                "please input the value for square side (mm)");

        String sideLengthStr = input.nextLine();

        String sideLengthStrmod = sideLengthStr + "\uF04A";
        for (int i = 0; i <= sideLengthStrmod.length() - 2; i++) {
            if (numStr.contains(sideLengthStrmod.substring(i, i + 1))) {
                countSide = countSide + 1;

            } else {
                System.out.println("Input error - you should use only digits\n" +
                        "Please rerun the aplication.");
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



