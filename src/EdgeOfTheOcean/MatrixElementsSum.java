package EdgeOfTheOcean;

public class MatrixElementsSum {

  public static void main(String[] args) {

    System.out.println(solution(new int[][]{ {1,2}, {3,4} }));
  }
  static int solution(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int totalSum = 0;

    for (int col = 0; col < cols; col++) {
      for (int row = 0; row < rows; row++) {
        if (matrix[row][col] == 0) {
          for (int k = row+1; k < rows; k++) {
            matrix[k][col] = 0;
          }
        } else {
          totalSum += matrix[row][col];
        }
      }
    }

    return totalSum;
  }


}
