package EdgeOfTheOcean;

import java.util.Arrays;

public class MakeArrayConsecutive2 {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{6,4,21,8478,9}));
  }
  static int solution(int[] statues) {
    Arrays.sort(statues);
    int count = 0;
    for (int i = 1; i < statues.length; i++) {
      int diff = statues[i] - statues[i-1] - 1;
      if (diff > 0) {
        count += diff;
      }
    }
    return count;
  }


}
