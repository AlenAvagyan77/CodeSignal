package EruptionofLight;

public class ElectionsWinners {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{6,8,4,5,6,8,8},6));
  }

  static int solution(int[] votes, int k) {
    int count = votes.length;
    for (int i = 0; i < votes.length; i++) {
      int sum = votes[i] + k;
      for (int j = 0; j < votes.length; j++) {
        if(i!=j&&sum<=votes[j]){
          count--;
          break;
        }
      }
    }
    return count;

  }


}
