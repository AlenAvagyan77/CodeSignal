package RainsOfReason;

import java.util.Arrays;

public class RainsOfReason {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(new int[]{1, 2, 1}, 1, 4)));
  }

  static int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
    for (int i = 0; i < inputArray.length; i++) {
      if (inputArray[i] == elemToReplace){
        inputArray[i] = substitutionElem;
      }
    }
    return inputArray;
  }

}
