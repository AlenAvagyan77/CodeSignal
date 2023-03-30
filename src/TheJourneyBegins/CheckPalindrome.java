package TheJourneyBegins;

public class CheckPalindrome {

  public static void main(String[] args) {
    System.out.println(solution("eye"));
  }
  static boolean solution(String inputString) {

    String s = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }

}
