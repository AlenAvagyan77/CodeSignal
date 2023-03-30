package LandOfLogic;

import java.util.Arrays;
import java.util.HashSet;

public class DifferentSquares {

  public static void main(String[] args) {
    //This code is a copy
    System.out.println(solution(new int[][]{{1, 2, 1}, {2 ,2 ,1}}));

  }
  static int solution(int[][] matrix) {
    HashSet<String> hashes = new HashSet<>();
    for (int i = 0; i < matrix.length - 1; i++) {
      for (int j = 0; j < matrix[i].length-1; j++) {
        int[][]mx = new int[2][2];
        for (int k = 0; k < 2; k++) {
          for (int l = 0; l < 2; l++) {
            mx[k][l] = matrix[i+k][j+l];

          }
        }
        hashes.add(Arrays.deepToString(mx));
      }
    }
    return hashes.size();
  }


}
