package day3_3007;

import java.util.HashSet;
import java.util.Set;

//https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java
public class Isogram {
    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!set.add(str.charAt(i))) {
                return false;
            }
        }
        return true;
        //return str.length() == str.toLowerCase().chars().distinct().sum();
    }
}