package DarkWilderness;

public class LongestDigitsPrefix {

  public static void main(String[] args) {
    System.out.println(solution("2023_Armenia_2003"));
  }

  static String solution(String inputString) {
    for (int i = 0; i < inputString.length(); i++) {
      if(!(Character.isDigit(inputString.charAt(i)))){
        return inputString.substring(0, i);
      }
    }
    return inputString;
  }


}
