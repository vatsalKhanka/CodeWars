package com.vatsal.four_kyu;

import java.math.BigInteger;
import java.util.Arrays;

public class SumofDivided {

    public static void main(String[] args) {

        for(int[] i : SudokuSolver.sudoku(new int[][]{
                new int[]{5, 3, 0, 0, 7, 0, 0, 0, 0},
                new int[]{6, 0, 0, 1, 9, 5, 0, 0, 0},
                new int[]{0, 9, 8, 0, 0, 0, 0, 6, 0},
                new int[]{8, 0, 0, 0, 6, 0, 0, 0, 3},
                new int[]{4, 0, 0, 8, 0, 3, 0, 0, 1},
                new int[]{7, 0, 0, 0, 2, 0, 0, 0, 6},
                new int[]{0, 6, 0, 0, 0, 0, 2, 8, 0},
                new int[]{0, 0, 0, 4, 1, 9, 0, 0, 5},
                new int[]{0, 0, 0, 0, 8, 0, 0, 7, 9}})) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static int lastDigit(BigInteger n1) {
        int base = Integer.parseInt(String.valueOf(String.valueOf(n1).toCharArray()[String.valueOf(n1).toCharArray().length - 1]));

        return base;
    }
}
