package DarkWilderness;

public class KnapsackLight {

  public static void main(String[] args) {
    //This code is a copy
    System.out.println(solution(1,2,3,4,5));
  }
  static int solution(int value1, int weight1, int value2, int weight2, int maxW) {
    if(weight1 > maxW && weight2 > maxW) return 0;
    if(weight1 + weight2 <= maxW) return value1 + value2;
    if(weight1 > maxW) return value2;
    if(weight2 > maxW) return value1;
    return Math.max(value1, value2);

  }


}
