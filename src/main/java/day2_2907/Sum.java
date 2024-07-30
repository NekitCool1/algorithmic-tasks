package day2_2907;

import java.util.stream.IntStream;

//https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java
public class Sum {
     public static int GetSum(int a, int b) {
      return a == b ? a : IntStream.rangeClosed(Math.min(a, b ), Math.max(a, b))
              .sum();
     }
  }