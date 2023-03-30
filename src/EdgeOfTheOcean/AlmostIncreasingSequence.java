package EdgeOfTheOcean;

public class AlmostIncreasingSequence {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{5,22,54,215,459893}));

  }
  static boolean solution(int[] sequence) {
    int n = sequence.length;
    int count = 0;

    for (int i = 1; i < n; i++) {
      if (sequence[i] <= sequence[i-1]) {
        count++;
        if (count > 1) {
          return false;
        }
        if (i < 2 || sequence[i] > sequence[i-2]) {
          sequence[i-1] = sequence[i];
        } else {
          sequence[i] = sequence[i-1];
        }
      }
    }

    return true;
  }


}
