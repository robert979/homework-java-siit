package com.siit.firstquiz;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ShapePerimeterArea {

    public static void main (String [] args) {
        ArrayList<Long> squareList = new ArrayList<>();
        ArrayList<Double> triangleList = new ArrayList<>();
        Triangle triangle = new Triangle();
        Square square = new Square();
        ArrayList<Long> rectangleList = new ArrayList<>();
        Rectangle rectangle = new Rectangle();
        ArrayList<Long> circleList = new ArrayList<>();
        Circle circle = new Circle();
        String genericAnswer = new String();
        String bigGenericAnswer = "yes";


        int countSquare = 0;


        String allOptions = "1234";

        Scanner input = new Scanner(System.in);
        while (bigGenericAnswer.equals("yes")) {

            genericAnswer = "yes";
            System.out.println("This is an app that can calculate the area and the perimeter for the following shapes:\\n\" +\n" +
                    "                1 - square\n" +
                    "                2 - circle\n" +
                    "                3 - rectangle \n" +
                    "                4 - triangle \n" +
                    "                So please chose for which of the described shapes you want to run the app");
            String choseOption = input.next();

            if (allOptions.contains(choseOption)) {
                if (choseOption.equals("1")) {
                    while (genericAnswer.equals("yes")) {

                        System.out.println("For the square please input the side value (mm)");
                        String squareSide = input.next();
                        if (checkIfDigits(squareSide)) {
                            if (!squareList.contains(transformStringIndigits(squareSide))) {
                                squareList.add(transformStringIndigits(squareSide));
                                square.calculateArea(transformStringIndigits(squareSide), 0, 0);
                                square.calculatePerimeter(transformStringIndigits(squareSide), 0, 0);


                            } else {
                                System.out.println("This square side was already checked");
                            }

                        }
                        System.out.println("Do you want to add a new square?\n" +
                                "Please type \"yes\" if do.");
                        String localAnswer = input.next();
                        genericAnswer = localAnswer.toLowerCase();
                    }

                }
                if (choseOption.equals("4")){
                    while (genericAnswer.equals("yes")){
                        System.out.println("For the triangle please input the value for each side as it folows\n" +
                                "side1  (mm) = ");
                        String side1trianlge = input.next();{
                            if (checkIfDigits(side1trianlge)){
                                System.out.println("side2(mm) = ");{
                                    String side2Triangle = input.next();
                                    if (checkIfDigits(side2Triangle)){
                                        System.out.println("side3(mm) =");
                                        String side3Triangle=input.next();
                                        if (checkIfDigits(side3Triangle)){
                                            double p =((transformStringIndigits(side1trianlge))+(transformStringIndigits(side2Triangle))+(transformStringIndigits(side3Triangle)))/2;
                                            double a= transformStringIndigits(side1trianlge);
                                            double b = transformStringIndigits(side2Triangle);
                                            double c = transformStringIndigits(side3Triangle);
                                            if ((Math.sqrt(p*(p-a)*(p-b)*(p-c)))>0) {
                                                if (!triangleList.contains((triangle.calculteAplusPerimeter(transformStringIndigits(side1trianlge), transformStringIndigits(side2Triangle), transformStringIndigits(side3Triangle))))) {
                                                    triangleList.add(triangle.calculteAplusPerimeter(transformStringIndigits(side1trianlge), transformStringIndigits(side2Triangle), transformStringIndigits(side3Triangle)));
                                                    triangle.calculateArea(transformStringIndigits(side1trianlge), transformStringIndigits(side2Triangle), transformStringIndigits(side3Triangle));
                                                    triangle.calculatePerimeter(transformStringIndigits(side1trianlge), transformStringIndigits(side2Triangle), transformStringIndigits(side3Triangle));
                                                } else {
                                                    System.out.println("This triangle was already checked");
                                                }
                                            }else {
                                                System.out.println("The values you gave can't give a valid triangle");
                                            }



                                        }
                                    }
                                }
                            }

                        }
                        System.out.println("Do you want to add a new triangle?\n" +
                                "Please type \"yes\" if do.");
                        String localAnswer = input.next();
                        genericAnswer = localAnswer.toLowerCase();

                    }

                }
                if (choseOption.equals("3")) {
                    while (genericAnswer.equals("yes")) {
                        System.out.println("For the rectangle " +
                                "please input the values as follows\n" +
                                "width(mm) =  ");
                        String width = input.next();
                        if (checkIfDigits(width)){
                            System.out.println("height(mm) =  ");
                            String height = input.next();
                            if(checkIfDigits(height)){
                                if (!height.equals(width)){
                                    if (!rectangleList.contains(rectangle.calculateAreaAndPerimeter(transformStringIndigits(height), transformStringIndigits(width)))){
                                        rectangleList.add(rectangle.calculateAreaAndPerimeter(transformStringIndigits(height), transformStringIndigits(width)));
                                        rectangle.calculateArea(transformStringIndigits(height), transformStringIndigits(width), 0);
                                        rectangle.calculatePerimeter(transformStringIndigits(height), transformStringIndigits(width), 0);
                                    } else {
                                        System.out.println("This rectangle was already checked ");
                                    }

                                }else if (!squareList.contains(transformStringIndigits(height))) {
                                    squareList.add(transformStringIndigits(width));
                                    System.out.println("The values you inserted correspond to a square");
                                    square.calculateArea(transformStringIndigits(width), 0, 0);
                                    square.calculatePerimeter(transformStringIndigits(width), 0, 0);
                                }else {
                                    System.out.println("The values you inserted correspond to a square that was already checked");
                                }



                            }
                        }
                        System.out.println("Do you want to add a new rectangle?\n" +
                                "Please type \"yes\" if do.");
                        String localAnswer = input.next();
                        genericAnswer = localAnswer.toLowerCase();
                    }

                }
                if (choseOption.equals("2")) {
                    while (genericAnswer.equals("yes")) {
                        System.out.println("For the circle " +
                                "please input the radius(mm)\n" );
                        String radius = input.next();
                        if (checkIfDigits(radius)){
                            if (!circleList.contains(transformStringIndigits(radius))){
                                circleList.add(transformStringIndigits(radius));
                                circle.calculateArea(transformStringIndigits(radius), 0,0 );
                                circle.calculatePerimeter(transformStringIndigits(radius), 0, 0);

                            }else {
                                System.out.println("This circle was already checked");
                            }



                        }
                        System.out.println("Do you want to add a new circle?\n" +
                                "Please type \"yes\" if do.");
                        String localAnswer = input.next();
                        genericAnswer = localAnswer.toLowerCase();


                    }

                    }



                    } else {
                System.out.println("Wrong input, please rerun the application and chose a digit from 1 to 4");
            }
            System.out.println("Do you want to rerun the app?\n" +
                    "Please type \"yes\" if do, otherwise the app will close");
            bigGenericAnswer=input.next().toLowerCase();

        }
    }


    public static long transformStringIndigits (String str){
        long a = 0;
        String strMod = str + "\uF04A";
        for (int j = strMod.length() - 1; j >= 1; j--) {
            a = a + (long) (Math.pow(10, (strMod.length() - (j + 1))) * parseInt(strMod.substring(j - 1, j)));

        }

        return a;
    }
    public static boolean checkIfDigits (String str){
        boolean onlyDigits = false;
        int countSide = 0;
        long sideLength = 0;
        String numStr = "0123456789";
        String strMod = str + "\uF04A";
        for (int i = 0; i<= strMod.length()-2; i++){
            if (numStr.contains(strMod.substring(i, i+1)) && transformStringIndigits(str)>0){
                countSide+=1;
            }
            else {
                System.out.println("Input error - you should use only digits, with the value greater then zero.");
                break;
            }
        }
        if (countSide== str.length()){
            onlyDigits = true;
        }

        return onlyDigits;
    }
}
