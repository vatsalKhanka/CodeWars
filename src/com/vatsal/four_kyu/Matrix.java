package com.vatsal.four_kyu;

public class Matrix {

    public static class Coords {
        public int i, j;
        public Coords(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public static int determinant(int[][] matrix) {
        System.out.println(matrix.length);

        long det = 0;

        if(matrix.length==1) det = matrix[0][0];

        if(matrix.length == 2) {
            det = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        if(matrix.length >= 3) {
            for(int i = 0; i < matrix.length; i++) {
                det += matrix[i][0] * determinant(minor(matrix, new Coords(i, 0))) * Math.pow(-1, i);
            }
        }

        return (int) det;
    }

    public static int[][] minor(int[][] matrix, Coords coords){
        int[][] minorMatrix = new int[matrix.length-1][matrix.length-1];
        int lastI = 0;
        int lastJ = 0;

        for(int i = 0; i < matrix.length; i++) {
            if(i == coords.i){
                continue;
            }
            if(lastI == matrix.length-1){
                break;
            }
            lastJ=0;
            for(int j = 0; j < matrix.length; j++) {
                if(j == coords.j) {
                    continue;
                }

                if(lastJ == matrix.length-1){
                    break;
                }
                minorMatrix[lastI][lastJ] = matrix[i][j];

                lastJ++;
            }
            lastI++;
        }
        return minorMatrix;
    }

    public static int[][] multMatrix(int mult, int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                matrix[i][j] = matrix[i][j] * mult;
            }
        }

        return matrix;
    }

}
