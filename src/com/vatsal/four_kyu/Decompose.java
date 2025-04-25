package com.vatsal.four_kyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Decompose {

    public static String decompose(long n) {

        ArrayList nums = new ArrayList<Long>();
        long square = n*n;
        while (square>1) {
            for (long i = 0; i < n; i++) {
                if (i * i < square && (i+1)*(i+1) >= square){
                    System.out.println(square);
                    square-=i*i;
                    System.out.println("Subtracted " + i + " squared which is " + i * i);
                    nums.add(i);
                }
            }
        }

        String output = "1";
        Collections.reverse(nums);
        System.out.println(nums);

        boolean foundNotOne = false;

        for(int i = 0; i < nums.size(); i++){
            Long num = (Long) nums.get(i);
            if(num != 1) foundNotOne = true;
            output += " " + num;
        }

        if(!foundNotOne) return null;
        System.out.println(output);

        return output;
    }

}
