package RainbowofClarity;

public class IsDigit {

  public static void main(String[] args) {
    System.out.println(solution('0'));
  }
  static boolean solution(char symbol) {
    if(symbol>47 && symbol < 58) {
      return true;
    }
    return false;
  }



}
