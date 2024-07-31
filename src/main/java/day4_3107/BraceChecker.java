package day4_3107;

//https://www.codewars.com/kata/5277c8a221e209d3f6000b56/train/java
public class BraceChecker {
  public boolean isValid(String braces) {
    int lengthOfBraces = braces.length();
    for(int i = 0; i < lengthOfBraces; i++){
      braces = braces.replace("{}", "").replace("[]", "").replace("()", "");
    }
    return braces.isEmpty();
  }

}