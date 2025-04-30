package com.vatsal.four_kyu;

import java.util.ArrayList;
import java.util.List;

public class ObservedPin {

    public static ArrayList<String> pins = new ArrayList<>();

    public static final int[][] adjacents = new int[][] {
            new int[] {0,8}, //0
            new int[] {1,2, 4}, //1
            new int[] {1,2, 3, 5}, //2
            new int[] {2,3, 6}, //3
            new int[] {1,4,5,7}, //4
            new int[] {2,4,5,6,8}, //5
            new int[] {3,5,6,9}, //6
            new int[] {4,7,8}, //7
            new int[] {0,5,7,8,9}, //8
            new int[] {6,8,9} //9
    };

    public static List<String> getPINs(String observed) {
        pins.clear();

        recurse("", observed, 0);

        return pins;
    }

    public static void recurse(String toAdd,String PIN, int index) {
        int num = Integer.parseInt(String.valueOf(PIN.charAt(index)));
        for(int i : adjacents[num]){
            if(index < PIN.length()-1){
                recurse(toAdd + String.valueOf(i) ,PIN, index + 1);
            } else {
                pins.add(toAdd + String.valueOf(i));
            }
        }
    }

    public static void recurseForever(int i) {
        System.out.println("I WILL RECURSE FOREVER!!!!!!! I HAVE ALREADY RECURSED " + i + " TIME(S)!!!!!!");
        recurseForever(i+1);
    }


}