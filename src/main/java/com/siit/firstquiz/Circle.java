package com.siit.firstquiz;

public class Circle implements IShape {
    @Override
    public double calculateArea(long side, long side1, long side2) {
        double circleArea = Math.PI*side*side;
        System.out.println("For the circle with the  given radius " + side + " mm\n" +
                "area = " + circleArea + " mm");


        return circleArea;
    }

    @Override
    public long calculatePerimeter(long side, long side1, long side2) {
        long circlePerimeter = (long) Math.PI *2*side;
        System.out.println("perimeter = " + circlePerimeter + " mm");
        return circlePerimeter;
    }
}
