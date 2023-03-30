package RainsOfReason;

public class AlphabeticShift {

  public static void main(String[] args) {
    System.out.println(solution("Armenia"));

  }
  static String solution(String inputString) {
    char[] chars = inputString.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if(inputString.charAt(i) == 'z'){
        chars[i] = 'a';
      }else{
        chars[i] += 1;
      }
    }
    return new String(chars);
  }


}
