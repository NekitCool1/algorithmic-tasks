package day4_3107;

//https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    StringBuilder sb = new StringBuilder("(");
    for (int i = 0; i < numbers.length; i++) {
      sb.append(numbers[i]);
      if (i == 2) {
        sb.append(") ");
      } else if (i == 5) {
        sb.append("-");
      }
    }
    return sb.toString();
  }
}
