package IslandOfKnowledge;

public class AreEquallyStrong {

  public static void main(String[] args) {
    System.out.println(solution(4, 5, 4, 5));

  }
  static boolean solution(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
    int yourMax = Math.max(yourLeft, yourRight);
    int yourMin = Math.min(yourLeft, yourRight);
    int friendsMax= Math.max(friendsLeft, friendsRight);
    int friendsMin = Math.min(friendsLeft, friendsRight);

    return yourMax == friendsMax && yourMin == friendsMin;
  }

}
