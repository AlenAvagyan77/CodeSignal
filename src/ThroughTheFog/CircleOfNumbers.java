package ThroughTheFog;

public class CircleOfNumbers {

  public static void main(String[] args) {
    //This code is a copy
    System.out.println(solution(9, 1));
  }
  static int solution(int n, int firstNumber) {
    return(firstNumber + n /2)%n;
  }


}
