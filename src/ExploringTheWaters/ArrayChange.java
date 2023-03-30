package ExploringTheWaters;

public class ArrayChange {

  public static void main(String[] args) {
    //This code is a copy
    System.out.println(solution(new int[]{44, 555, 254 ,11, 22}));
  }

  static int solution(int[] inputArray) {
    int moves = 0;
    int prevNum = inputArray[0];

    for (int i = 1; i < inputArray.length; i++) {
      int currentNum = inputArray[i];

      if (currentNum <= prevNum) {
        moves += prevNum - currentNum + 1;
        currentNum = prevNum + 1;
      }

      prevNum = currentNum;
    }

    return moves;
  }


}
