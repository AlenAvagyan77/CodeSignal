package IslandOfKnowledge;

public class ArrayMaximalAdjacentDifference {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{20, 20, 10}));

  }
  static int solution(int[] inputArray) {
    int maxDiff = 0;
    for (int i = 1; i < inputArray.length; i++) {
      int diff =  Math.abs(inputArray[i] - inputArray[i - 1]);
      if(diff > maxDiff){
        maxDiff = diff;
      }
    }
    return maxDiff;
  }
}
