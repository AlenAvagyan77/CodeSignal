package RainsOfReason;

public class EvenDigitsOnly {

  public static void main(String[] args) {
    System.out.println(solution(2468));

  }

  static boolean solution(int n) {
    if(n == 0) {
      return true;
    }
    if(n % 2 != 0){
      return false;
    }
    return solution(n / 10);
  }


}
