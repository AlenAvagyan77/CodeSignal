package DarkWilderness;

public class GrowingPlant {

  public static void main(String[] args) {
    System.out.println(solution(100, 10,910));

  }
  static int solution(int upSpeed, int downSpeed, int desiredHeight) {
    int height = 0;
    int days = 0;
    while(height<desiredHeight){
      height+=upSpeed;
      days++;
      if(height >= desiredHeight){
        break;
      }else{
        height-=downSpeed;
      }
    }
    return days;

  }

}
