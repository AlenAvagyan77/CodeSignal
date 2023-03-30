package DivingDeeper;

import java.util.HashSet;
import java.util.Set;

public class DifferentSymbolsNaive {

  public static void main(String[] args) {
    System.out.println(solution("abcdefkkl"));

  }
  static int solution(String s) {
    if(s == null || s.isEmpty()){
      return 0;
    }
    Set<Character> set = new HashSet<>();
    for (char c : s.toCharArray()){
      set.add(c);
    }

    return set.size();

  }


}
