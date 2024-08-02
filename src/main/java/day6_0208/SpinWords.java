package day6_0208;

import java.util.Arrays;

//https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
public class SpinWords {

  public static String spinWords(String sentence) {
    StringBuilder sb = new StringBuilder();
    String[] split = sentence.split(" ");
    Arrays.stream(split)
            .map(s -> s.length() >= 5 ? reverseWord(s) : s)
            .forEach(s -> sb.append(s).append(" "));
    return sb.deleteCharAt(sb.length() - 1).toString();
  }
  private static String reverseWord(String string) {
    StringBuilder sb = new StringBuilder();
    for (int i = string.length() - 1; i >= 0; i--) {
      sb.append(string.charAt(i));
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(spinWords("Hey fellow warriors"));
  }
}