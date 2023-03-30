package LandOfLogic;

public class LongestWord {

  public static void main(String[] args) {
    System.out.println(solution("Hello I am Alen Avagyan"));

  }
  static String solution(String text) {
    String [] words = text.split("[^a-zA-Z]+");
    int max = 0;
    String str = "";
    for (String s : words) {
      if(s.length() > max){
        max = s.length();
        str = s;
      }
    }
    return str;
  }


}
