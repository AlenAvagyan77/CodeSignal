package EdgeOfTheOcean;

public class ShapeArea {

  public static void main(String[] args) {
    System.out.println(solution(9));
  }
  static int solution(int n) {
    int num = 1;
    for(int i = 1; i <= n; i++){
      num = num + (4 * (i-1));
    }
    return num;
  }


}
