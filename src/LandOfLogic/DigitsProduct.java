package LandOfLogic;

public class DigitsProduct {

  public static void main(String[] args) {
    System.out.println(solution(50));
  }
  static int solution(int product) {
    if (product == 0)
      return 10;
    if (product < 10)
      return product;

    String r = "";
    for (int d = 9; d > 1; d--)
      for (; product % d == 0; product /= d)
        r = d + r;
    return product == 1 ? new Integer(r) : -1;

  }


}
