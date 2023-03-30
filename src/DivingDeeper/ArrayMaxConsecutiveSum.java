package DivingDeeper;

public class ArrayMaxConsecutiveSum {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{2 ,5 ,4 ,6 ,7}, 3));
  }
  static int solution(int[] inputArray, int k) {
    int s = 0, ma;
    for(int i = 0; i < k; i++) s += inputArray[i];
    ma = s;
    for(int i = k; i < inputArray.length; i++) {
      s += inputArray[i] - inputArray[i - k];
      ma = Math.max(ma, s);
    }
    return ma;
  }

}
