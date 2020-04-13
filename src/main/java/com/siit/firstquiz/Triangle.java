package com.siit.firstquiz;

public class Triangle implements IShape {

    @Override
    public double calculateArea(long side, long side1, long side2) {
       double trinagleArea=  Math.sqrt(
                ((side+side1+side2)/2)*
                        (((side+side1+side2)/2)-side)*
                        (((side+side1+side2)/2)-side1)*
                        (((side+side1+side2)/2)-side2));
        if (trinagleArea > 0) {
            System.out.println("For the give sides for a triangle, side1 = " + side + "(mm), side2 = "+side1 + " (mm), side 3 = " + side2 + " mm\n" +
                    "area = " + trinagleArea+" square mm");

            }

        else {
            System.out.println("The values you gave can't give a valid triangle");
            trinagleArea =0;


        }
        return trinagleArea;
    }

    @Override
    public long calculatePerimeter(long side, long side1, long side2) {
        long trianglePerimeter = side+side1+side2;
         double trinagleArea=  (Math.sqrt(
                ((side+side1+side2)/2)* (((side+side1+side2)/2)-side)* (((side+side1+side2)/2)-side1)* (((side+side1+side2)/2)-side2)));
         if(trinagleArea>0){
            System.out.println("perimeter = " + trianglePerimeter + " mm");}
            else {
                trianglePerimeter=0;
             }

        return trianglePerimeter;
    }
    public  double calculteAplusPerimeter(long side, long side1, long side2){
        double areaPlusPerimeter =1000*  Math.sqrt(((side+side1+side2)/3)*(((side+side1+side2)/3)-side)*(((side+side1+side2)/3)-side1)*(((side+side1+side2)/3)-side2))+
                (side+side1+side2);
        return areaPlusPerimeter;
    }
}
