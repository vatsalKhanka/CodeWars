package com.vatsal.four_kyu;

import java.math.BigInteger;
import java.util.Arrays;

public class SumofDivided {

    public static void main(String[] args) {
        System.out.println(lastDigit(new BigInteger("68")));
    }

    public static int lastDigit(BigInteger n1) {
        int base = Integer.parseInt(String.valueOf(String.valueOf(n1).toCharArray()[String.valueOf(n1).toCharArray().length -1]));

        return base;
    }
}
