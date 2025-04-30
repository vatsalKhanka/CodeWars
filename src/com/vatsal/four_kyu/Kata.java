package com.vatsal.four_kyu;

public class Kata {

    public static String add(String a, String b) {
        String sum = "";
        int carry = 0;

        if(a.length() > b.length()) {
            for(int i = b.length(); i < a.length(); i++) b = "0" + b;
        }

        if(b.length() > a.length()) {
            for(int i = a.length(); i < b.length(); i++) a = "0" + a;
        }

        for(int i = 0; i < a.length(); i++) {
            int digitA = a.toCharArray()[a.length()-1-i]-48;
            int digitB = b.toCharArray()[b.length()-1-i]-48;
            int tempSum = digitA + digitB + carry;
            String sTempSum = String.valueOf(tempSum);

            if(i < a.length()-1) {
                if(sTempSum.length() >= 2) {
                    sum = sTempSum.toCharArray()[sTempSum.length() - 1] + sum;
                    sTempSum = sTempSum.substring(0, sTempSum.length() - 1);
                    carry = Integer.parseInt(sTempSum);
                } else {
                    sum = sTempSum + sum;
                    carry = 0;
                }
            } else {
                sum = sTempSum + sum;
            }
        }

        while(sum.toCharArray()[0] == '0') {
            sum = sum.substring(1);
        }

        return sum;
    }

}
