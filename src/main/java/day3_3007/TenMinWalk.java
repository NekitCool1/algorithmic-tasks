package day3_3007;

//https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    int length = walk.length;
    int x = 0;
    int y = 0;
    for (char direction : walk) {
        switch (direction) {
            case 'n' -> y++;
            case 's' -> y--;
            case 'e' -> x++;
            case 'w' -> x--;
        }
    }
    return length == 10 && x == 0 && y == 0;
  }
}