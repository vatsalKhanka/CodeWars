package com.vatsal.four_kyu;

import java.util.ArrayList;
import java.util.List;

public class ObservedPin {

    public static List<String> getPINs(String observed) {
        ArrayList<String> pins = new ArrayList<>();
        int[] pinDigits = new int[observed.length()];
        for(int i = 0; i < observed.length(); i++) {
            pinDigits[i] = Integer.parseInt(String.valueOf(observed.charAt(i)));
        }

        int[][] adjacents = new int[][] {
                new int[] {8}, //0
                new int[] {2, 4}, //1
                new int[] {1, 3, 5}, //2
                new int[] {2, 6}, //3
                new int[] {1,5,7}, //4
                new int[] {2,4,6,8}, //5
                new int[] {3,5,9}, //6
                new int[] {4,8}, //7
                new int[] {0,5,7,9}, //8
                new int[] {6,8}, //9
        };

        for(int i = 0; i < observed.length(); i++){

        }

        return pins;
    } // getPINs

} // ObservedPin
