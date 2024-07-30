package day2_2907;

//https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/java
public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        String s = String.valueOf(number);
        int sum = s.chars()
                .map(Character::getNumericValue)
                .map(n -> (int) Math.pow(n, s.length()))
                .sum();
        return sum == number;
    }
}