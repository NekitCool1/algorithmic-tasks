package day2_2907;

//https://www.codewars.com/kata/5287e858c6b5a9678200083c/train/java
public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        int sum = 0;
        String s = String.valueOf(number);
        int power = s.length();
        for (int i = 0; i < s.length(); i++) {
            sum += (int) Math.pow(Integer.parseInt(String.valueOf(s.charAt(i))), power);
        }
        return number == sum;
    }

    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }
}