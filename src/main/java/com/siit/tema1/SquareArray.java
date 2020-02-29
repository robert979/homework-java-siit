package com.siit.tema1;

public class SquareArray {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 8},
                {5, 6, 7, 5},
                {4, 5, 8, 5},
                {5, 7, 9, 9}
        };
        int b= matrix.length;

        boolean issquare=false;
        for (int i =0;i<=b-1;i++ ){
            //System.out.println(", " + matrix[i].length);
            if(b!=matrix [i].length){

              issquare = false;
              break;

            }
            
            else {
                issquare=true;

            }
        }
            if (issquare) {
                System.out.println("Matricea este patrata");
            }
            else {
                System.out.println("Matricea nu este patrata");
            }

    }
}


