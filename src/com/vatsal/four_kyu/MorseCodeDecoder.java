package com.vatsal.four_kyu;

import java.util.*;

public class MorseCodeDecoder {

    public static String rangeExtraction(int[] arr) {
        String answer = "";
        for(int i = 0; i < arr.length; i++) {
            int latestIndex = 0;
            boolean useRange = false;
            String append;

            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] - arr[j-1] == 1) {
                    useRange = true;
                    latestIndex = j;
                } else break;
            }

            if(useRange && latestIndex - i > 1){
                append = Integer.toString(arr[i]) + "-" + Integer.toString(arr[latestIndex]);
                i=latestIndex;
            }
            else append = Integer.toString(arr[i]);

            if(i < arr.length-1) append += ",";
            answer += append;
        }

        return answer;
    }

    public static String sumStrings(String a, String b) {
        String num = "";
        for(int i = 0; i < Math.max(a.length(), b.length()); i++) {
            int carry = 0;

            if (Math.max(a.length(), b.length()) == a.length()) {
                int add = Integer.parseInt(String.valueOf(a.charAt(i)));
                if(i < b.length()) add += Integer.parseInt(String.valueOf(b.charAt(i)));
                add += carry;
                carry = 0;
                if(Integer.toString(add).length() >= 2){
                    if(i == a.length()-1){
                        add += carry;
                    } else {
                        carry = Integer.parseInt(Integer.toString(add).substring(0, Integer.toString(add).length() - 1));
                        add = Integer.parseInt(Integer.toString(add).substring(Integer.toString(add).length() - 1));
                    }
                }
                num+=Integer.toString(add);
            } else {
                int add = Integer.parseInt(String.valueOf(b.charAt(i)));
                if(i < a.length()) add += Integer.parseInt(String.valueOf(a.charAt(i)));
                add += carry;
                carry = 0;
                if(i == b.length()-1){
                    add += carry;
                } else {
                    carry = Integer.parseInt(Integer.toString(add).substring(0, Integer.toString(add).length() - 1));
                    add = Integer.parseInt(Integer.toString(add).substring(Integer.toString(add).length() - 1));
                }

                num+=Integer.toString(add);
            }

        }

        return num;
    }

}
