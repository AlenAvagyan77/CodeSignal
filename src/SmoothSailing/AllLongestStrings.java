package SmoothSailing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllLongestStrings {

  public static void main(String[] args) {
    String[] inputArray = {"America","Armenia", "Italia", "Germania"};
    String[] result = solution(inputArray);
    System.out.println(Arrays.toString(result));
  }

  static String[] solution(String[] inputArray) {
    int maxLenght = 0;
    List<String> longestStrings = new ArrayList<>();
    for(String str : inputArray){
      int length = str.length();
      if(length > maxLenght){
        maxLenght = length;
      }
    }
    for(String str: inputArray){
      if(str.length() == maxLenght)
        longestStrings.add(str);
    }
    return longestStrings.toArray(new String[0]);
  }


}
