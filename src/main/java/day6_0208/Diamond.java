package day6_0208;

//https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java
class Diamond {
  public static String print(int n) {
      StringBuilder sb = new StringBuilder();
      int mid = n / 2;
      if (n % 2 == 0 || n < 1) {
          return null;
      }
          for (int i = 0; i < mid; i++) {
              for (int j = 0; j < mid - i; j++) {
                  sb.append(" ");
              }
              for (int j = 0; j < 2 * i + 1; j++) {
                  sb.append("*");
              }
              sb.append("\n");
          }
          for (int i = 0; i < n; i++) {
              sb.append("*");
          }
          sb.append("\n");
          for (int i = mid - 1; i >= 0; i--) {
              for (int j = 0; j < mid - i; j++) {
                  sb.append(" ");
              }
              for (int j = 0; j < 2 * i + 1; j++) {
                  sb.append("*");
              }
              sb.append("\n");
          }
      return sb.toString();
	}

    public static void main(String[] args) {
        System.out.println(print(0));
    }
}