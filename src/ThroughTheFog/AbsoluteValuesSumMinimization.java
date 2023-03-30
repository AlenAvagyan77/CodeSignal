package ThroughTheFog;

public class AbsoluteValuesSumMinimization {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{2, 4, 5, 7, 10, 20}));
  }
  static int solution(int[] a) {
    if(a.length % 2 != 0){
      return a[a.length/2];
    }
    return a[a.length/2 - 1];
  }


}
