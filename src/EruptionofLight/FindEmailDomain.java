package EruptionofLight;

public class FindEmailDomain {

  public static void main(String[] args) {
    System.out.println(solution("prettyandsimple@example.com"));  }

  static String solution(String address) {
    return address.substring(address.lastIndexOf("@") + 1);

  }


}
