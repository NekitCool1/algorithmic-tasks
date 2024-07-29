package day2_2907;

//https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java
public class Sum {
     public static int GetSum(int a, int b) {
         int temp = 0;
         for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
             temp += i;
         }
      return a == b ? a : temp;
     }
  }