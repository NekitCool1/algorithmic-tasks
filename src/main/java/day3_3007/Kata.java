package day3_3007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Kata {
  public static int[] sortArray(int[] array) {
    int temp = 0;
    int[] odds = IntStream.of(array)
            .filter(n -> n % 2 != 0)
            .sorted()
            .toArray();
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        array[i] = odds[temp];
        temp += 1;
      }
    }
    return array;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sortArray(new int[]{5, 8, 6, 3, 4})));
  }
}