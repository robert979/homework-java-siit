package com.siit.tema2;

public class SquareArrayMetode {
    static public void main (String ... args) {
        int[][] matrix = {
                {1, 2, 3, 8},
                {5, 6, 7, 5},
                {4, 5, 8, 5},
                {5, 7, 9, 10}
        };
        checkSquareMatrix(matrix);

    }
    public static void checkSquareMatrix(int [][]matrix){
        int l = matrix.length;
        int c=0;
        for (int i=0; i<=l-1;i++){
            if (l!=matrix[i].length){

               c=1;
            }

        }
        if(c==1){

                System.out.println("Matricea nu este patrata");

        }
        else {
            System.out.println("Matricea  este patrata");
        }
    }
}
