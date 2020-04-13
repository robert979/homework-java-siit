package com.siit.firstquiz;

public class Rectangle implements IShape {
    @Override
    public double calculateArea(long side, long side1, long side2) {
        long rectangleArea = side*side1;
        if (side>side1){
        System.out.println(" For the rectangle with the given width " + side + " (mm), and height " + side1 + " (mm)\n" +
                "area = " + rectangleArea + " square mm");
        }else {
            System.out.println(" For the rectangle with the given width " + side1 + " (mm), and height " + side + " (mm)\n" +
                    "area = " + rectangleArea + " square mm");
        }


        return rectangleArea;
         }

    @Override
    public long calculatePerimeter(long side, long side1, long side2) {
        long rectanglePerimeter = (side+side1)*2;
        System.out.println("perimeter = " + rectanglePerimeter + " mm");
        return rectanglePerimeter;
    }
    public long calculateAreaAndPerimeter (long side1, long side2){
        long AreaAndPerimeter = (side1*side2) + (side1+side2)*2;
        return AreaAndPerimeter;
    }
}
