package day1_2807;

import java.util.Arrays;

//https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java
public class Solution{

    static String toCamelCase(String s){
        String[] split = s.split("[-_]");
        StringBuilder sb = new StringBuilder(split[0]);
        for (int i = 1; i < split.length; i++) {
            sb.append(split[i].replace(split[i].charAt(0), Character.toUpperCase(split[i].charAt(0))));
        }
        return sb.toString();
    }
}
