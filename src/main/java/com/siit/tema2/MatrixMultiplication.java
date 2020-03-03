package com.siit.tema2;

public class MatrixMultiplication {
    static public void main(String... args) {
        int[][] a = {
                {2, 4, 9},
                {4, 3, 12},
                {10, 4, 6},
        };
        int[][] b = {
                {14, 3, 8},
                {12, 11, 10},
                {9, 20, 4}
        };
        multiplyMatrix(a, b);


    }

    public static void multiplyMatrix(int[][] a, int[][] b) {
        int[][] c = new int[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];


            }

        }
        for (int k = 0; k <= 2; k++) {
            System.out.print(c[0][k] + ", ");
        }
        System.out.println();
        for (int k = 0; k <= 2; k++) {
            System.out.print(c[1][k] + ", ");
        }
        System.out.println();
        for (int k = 0; k <= 2; k++) {
            System.out.print(c[2][k] + ", ");
        }
    }
}


