package ExploringTheWaters;

import java.util.Arrays;

public class AddBorder {

  public static void main(String[] args) {
    String[] inputArray = {"America","Armenia", "Italia", "Germania"};
    String[] result = solution(inputArray);
    System.out.println(Arrays.toString(result));

  }
  static String[] solution(String[] picture) {
    int width = picture[0].length();
    String[] result = new String[picture.length + 2];
    result[0] = getAsterisks(width + 2);
    result[result.length - 1] = getAsterisks(width + 2);

    for (int i = 0; i < picture.length; i++) {
      result[i + 1] = "*" + picture[i] + "*";
    }
    return result;
  }

  private static String getAsterisks(int length) {
    char[] asterisks = new char[length];
    Arrays.fill(asterisks, '*');
    return new String(asterisks);
  }
}
