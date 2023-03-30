package IslandOfKnowledge;

public class AvoidObstacles {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{1, 2, 3 ,4 , 5 ,6 }));

  }
  static int solution(int[] inputArray) {
    int jump = 1;
    boolean fail = true;

    while(fail){
      jump++;
      fail = false;
      for(int i = 0; i < inputArray.length; i++){
        if(inputArray[i]%jump==0){
          fail = true;
          break;
        }
      }
    }
    return jump;

  }


}
