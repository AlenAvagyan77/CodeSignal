package ExploringTheWaters;

import java.util.HashMap;

public class PalindromeRearranging {

  public static void main(String[] args) {
    System.out.println(solution("eye"));
  }
  static boolean solution(String inputString) {
    HashMap<Character, Integer> charCounts =  new HashMap<>();
    for (int i = 0; i < inputString.length(); i++) {
      char c = inputString.charAt(i);
      charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
    }
    int oddCount = 0;
    for (int count : charCounts.values()) {
      if(count % 2 != 0){
        oddCount++;
      }
    }
    return oddCount<=1;
  }


}
