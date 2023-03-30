package EruptionofLight;

public class IsBeautifulString {

  public static void main(String[] args) {
    System.out.println(solution("bbbaacdafe"));

  }

  static boolean solution(String inputString) {
    int [] c = new int[26];

    for (int i : inputString.getBytes()) c[i-'a'] ++;

    for (int i = 1; i < 26; i ++)
      if (c[i] > c[i-1])
        return false;

    return true;

  }


}
