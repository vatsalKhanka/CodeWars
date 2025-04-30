package com.vatsal.four_kyu;

import java.math.BigInteger;
import java.util.Arrays;

public class SumofDivided {

    public static void main(String[] args) {
        for(int[] i : Matrix.minor(new int[][]{

                new int[]{1,2,3},
                new int[]{4,5,6},
                new int[]{7,8,9}

        }, new Matrix.Coords(0,0))) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static int lastDigit(BigInteger n1) {
        int base = Integer.parseInt(String.valueOf(String.valueOf(n1).toCharArray()[String.valueOf(n1).toCharArray().length - 1]));

        return base;
    }
}
