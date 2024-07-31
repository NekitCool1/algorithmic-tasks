package day4_3107;

import java.util.ArrayList;
import java.util.List;

//https://www.codewars.com/kata/550f22f4d758534c1100025a/train/java
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> list = new ArrayList<>();
        for (String dir: arr) {
            if (list.contains(opposite(dir))) {
                list.remove(opposite(dir));
            } else {
                list.add(dir);
            }
        }
        return list.toArray(new String[0]);
    }

    private static String opposite(String dir) {
        switch (dir) {
            case "EAST" -> {
                return "WEST";
            }
            case "WEST" -> {
                return "EAST";
            }
            case "SOUTH" -> {
                return "NORTH";
            }
            case "NORTH" -> {
                return "SOUTH";
            }
        }
        return null;
    }
}
