package com.vatsal.four_kyu;

import javax.swing.*;
import java.util.HashMap;

public class HexToRGB {


    public static HashMap<String, Integer> hexStringToRGB(String hex) {

        // hex -> {r, g, b}
        HashMap<String, Integer> answer = new HashMap();

        //#FFFFFF
        System.out.println(hex.substring(1, 3));
        answer.put("r", Integer.parseInt(hex.substring(1, 3), 16));
        answer.put("g", Integer.parseInt(hex.substring(3, 5), 16));
        answer.put("b", Integer.parseInt(hex.substring(5,7), 16));

        return answer;
    }


}
