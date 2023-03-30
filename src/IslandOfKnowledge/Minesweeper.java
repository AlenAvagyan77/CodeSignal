package IslandOfKnowledge;

import java.util.Arrays;

public class Minesweeper {

  public static void main(String[] args) {
    //This code is a copy
    System.out.println(
        Arrays.deepToString(solution(new boolean[][]{{false, true, true}, {false, true, false}})));
  }

  static int[][] solution(boolean[][] matrix) {
    int[][] result = new int [matrix.length][matrix[0].length];

    for (int i = 0; i < matrix.length; i++){
      for (int j = 0; j < matrix[0].length; j++){
        int neighbors = 0;
        if (i > 0 && matrix[i-1][j]) neighbors++;

        if (i+1 < matrix.length && matrix[i+1][j]) neighbors++;

        if(j > 0 && matrix[i][j-1]) neighbors++;

        if (j+1 < matrix[0].length && matrix[i][j+1]) neighbors++;

        if (i > 0 && j > 0 && matrix[i-1][j-1]) neighbors++;

        if (i > 0 && j+1 < matrix[0].length && matrix[i-1][j+1]) neighbors++;

        if (i+1 < matrix.length && j > 0 && matrix[i+1][j-1]) neighbors++;

        if (i+1 < matrix.length && j+1 < matrix[0].length && matrix[i+1][j+1]) neighbors++;

        result[i][j] = neighbors;
      }
    }

    return result;
  }


}
