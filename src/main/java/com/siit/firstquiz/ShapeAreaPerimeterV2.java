package com.siit.firstquiz;

import java.util.Scanner;

public class ShapeAreaPerimeterV2 {
public static void main(String []args){

    Scanner input = new Scanner(System.in);
    System.out.println("This is an aplication that can calculate the area and the perimeter for the following shapes:\n" +
            "-square\n" +
            "-circle\n" +
            "-rectangle\n" +
            "-triangle\n");
    System.out.println("Please read carefully and chose the following options");
    System.out.println("Do you want to calculate the area/perimeter for a square? --> please type \"Yes\" if you do");
    String opt1=input.next();
    if(opt1.toLowerCase().equals("yes")){
        System.out.println("Please specify the value of the square side (mm)");
        long sideSquare=input.nextLong();
        long squareArea= (long) Math.pow(sideSquare,2);
        long squarePerimeter = 4*sideSquare;
        System.out.println("Given the square side of " + sideSquare + " mm\n" +
                "The area = " + squareArea + " square mm\n" +
                "The perimeter =  " + squarePerimeter + " mm");

    }
    else {
        System.out.println("You din't type \"yes\" therefore the calculation for area and perimeter of a square was aborted " );
    }
    System.out.println("Do you want to calculate the area/perimeter for a circle ? --> please type \"Yes\" if you do");
    String opt2=input.next();
    if(opt2.toLowerCase().equals("yes")) {
        System.out.println("Please specify the value of the radius (mm)");
        long radius = input.nextLong();
        System.out.println("Given the circle radidius of " + radius + " mm\n" +
                "The circle area = " + (Math.PI*Math.pow(radius, 2))+ " square mm\n" +
                "The circle perimeter = " + (2*Math.PI*radius) + " mm");

    }
    else {
        System.out.println("You din't type \"yes\" therefore the calculation for area and perimeter of a circle  was aborted " );
    }
    System.out.println("Do you want to calculate the area/perimeter for a rectangle ? --> please type \"Yes\" if you do");
    String opt3=input.next();
    if(opt3.toLowerCase().equals("yes")) {
        System.out.println("Please specify the value of the rectangular's width (mm)");
        long width = input.nextLong();
        System.out.println("Please specify the value of the rectangular's hight (mm)");
        long height = input.nextLong();
        System.out.println("Given the width of " + width + " mm" +  " and the hEight of " + height + " mm, for a rectangle \n" +
                "The rectagle area = " + (height*width) + " square mm\n" +
                "The rectangle perimeter = " + (2*(height+width)) + " mm");

    }
    else {
        System.out.println("You din't type \"yes\" therefore the calculation for area and perimeter of a rectangle  was aborted " );
    }

    System.out.println("Do you want to calculate the area/perimeter for a triangle ? --> please type \"Yes\" if you do");
    String opt4=input.next();
    if(opt4.toLowerCase().equals("yes")) {
        System.out.println("Please specify the value of each side as follow (mm)");
        System.out.println("Please specify the value for 1st side (mm)");
        long side1 = input.nextLong();
        System.out.println("Please specify the value for 2nd side (mm)");
        long side2 = input.nextLong();
        System.out.println("Please specify the value for 3rd side (mm)");
        long side3 = input.nextLong();
        double perimeterTriangle = side1+side2+side3;
        double perPer2 = perimeterTriangle/2;
        double areaTriangle =  Math.sqrt(perPer2* (perPer2-side1)*(perPer2-side2)*(perPer2-side3));
        if (areaTriangle > 0 ){
                System.out.println("The triangle are = " + areaTriangle +" square mm");
           }
        else {
            System.out.println("Imposible triangle - the values you assigned can't \"build\" a triangle");
        }

        }

    else {
        System.out.println("\nYou din't type \"yes\" therefore the calculation for area and perimeter of a triangle  was aborted " );
    }


}
}
