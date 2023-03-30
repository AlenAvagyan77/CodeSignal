package ExploringTheWaters;

import java.util.Arrays;

public class AlternatingSums {

  public static void main(String[] args) {
    int[] a = {5, 4, 8, 21, 55};
    int[] result = solution(a);
    System.out.println(Arrays.toString(result));
  }

  static int[] solution(int[] a) {
    int team1 = 0;
    int team2 = 0;
    for (int i = 0; i < a.length; i++) {
      if (i % 2 == 0) {
        team1 += a[i];
      } else {
        team2 += a[i];
      }
    }
    return new int[]{team1, team2};
  }


}
