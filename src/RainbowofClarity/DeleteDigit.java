package RainbowofClarity;

public class DeleteDigit {

  public static void main(String[] args) {
    System.out.println(solution(152));
  }
  static int solution(int n) {
    String str = n + "";
    int max = 0;
    for(int i = 0; i < str.length(); i++)
      max = Math.max(max, Integer.parseInt(str.substring(0, i) + str.substring(i + 1)));
    return max;

  }


}
