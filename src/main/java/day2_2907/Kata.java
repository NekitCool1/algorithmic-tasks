package day2_2907;

//https://www.codewars.com/kata/56747fd5cb988479af000028/train/java
class Kata {
  public static String getMiddle(String word) {
    if (word.length() % 2 == 0) {
      return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
    } else {
      return Character.toString(word.charAt(word.length() / 2));
    }
  }
}