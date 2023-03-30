package ExploringTheWaters;

public class AreSimilar {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{5, 65 ,8 ,7, 21}, new int[]{33, 88 ,4 ,75 ,45}));

  }
  static boolean solution(int[] a, int[] b) {
    if (a.length != b.length) {
      return false;
    }

    int diffCount = 0;
    int[] aDiff = new int[2];
    int[] bDiff = new int[2];

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        if (diffCount == 2) {
          return false;
        }
        aDiff[diffCount] = a[i];
        bDiff[diffCount] = b[i];
        diffCount++;
      }
    }

    if (diffCount == 0) {
      return true;
    }

    if (diffCount == 2 && aDiff[0] == bDiff[1] && aDiff[1] == bDiff[0]) {
      return true;
    }

    return false;
  }


}
