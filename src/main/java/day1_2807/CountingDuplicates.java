package day1_2807;

import java.util.HashMap;

//https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
public class CountingDuplicates {
  public static int duplicateCount(String text) {
    int temp = 0;
    text = text.toLowerCase();
    HashMap<Character, Integer> charCount = new HashMap<>();
    for (char c : text.toCharArray()) {
      charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }
    for (Integer count : charCount.values()) {
      if (count > 1) {
        temp++;
      }
    }
    return temp;
  }

  public static void main(String[] args) {
    duplicateCount("adadadac");
  }
}