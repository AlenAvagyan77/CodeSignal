package LandOfLogic;

public class Sudoku {

  public static void main(String[] args) {
    int[][] testArray = {
        {5, 3, 4, 6, 7, 8, 9, 1, 2},
        {6, 7, 2, 1, 9, 5, 3, 4, 8},
        {1, 9, 8, 3, 4, 2, 5, 6, 7},
        {8, 5, 9, 7, 6, 1, 4, 2, 3},
        {4, 2, 6, 8, 5, 3, 7, 9, 1},
        {7, 1, 3, 9, 2, 4, 8, 5, 6},
        {9, 6, 1, 5, 3, 7, 2, 8, 4},
        {2, 8, 7, 4, 1, 9, 6, 3, 5},
        {3, 4, 5, 2, 8, 6, 1, 7, 9}
    };
    System.out.println(solution(testArray));
  }
  static boolean solution(int[][] grid) {
    for (int i = 0; i < 3; i++ ){
      for (int j = 0; j < 3; j++) {
        int [][] counts = new int[3][9];
        for (int x = 0; x < 3;x++) {
          for (int y = 0; y < 3; y++ ) {
            counts[0][grid[i*3+x][j*3+y]-1] = 1;
            counts[1][grid[i*3+j][x*3+y]-1] = 1;
            counts[2][grid[x*3+y][i*3+j]-1] = 1;
          }
        }
        for (int k = 0; k < 9; k++) {
          if(counts[0][k] == 0 || counts[1][k] == 0 || counts[2][k] == 0){
            return false;
          }
        }
      }
    }
    return true;
  }


}
