package day1_2807;

import java.util.Arrays;

//https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
public class Solution{

    static String toCamelCase(String s){
        StringBuilder sb = new StringBuilder();
        String[] split = s.split("[-_]");
        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                sb.append(split[i]);
            } else {
                sb.append(split[i].replace(split[i].charAt(0), Character.toUpperCase(split[i].charAt(0))));
            }
        }
        return sb.toString();
    }
}
