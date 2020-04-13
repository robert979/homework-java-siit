package com.siit.firstquiz;

public class Square implements IShape {
    private long side;


    @Override
    public double calculateArea(long side, long side1, long side2) {
        long squareArea = side * side;
        System.out.println("For the given square side = " + side + " mm\n" +
                "area = " + squareArea + " square mm");
        return squareArea;

    }

    @Override
    public long calculatePerimeter(long side, long side1, long side2) {
        long squarePerimeter = 4 * side;
        System.out.println("perimeter = " + squarePerimeter + " mm");

        return squarePerimeter;

    }
}
