package EruptionofLight;

public class IsMAC48Address {

  public static void main(String[] args) {
    System.out.println(solution("00-1B-63-84-45-E6"));
  }
  static boolean solution(String inputString) {
    String [] arr = inputString.split("-", -1);
    if(arr.length != 6) return false;

    for(String s : arr){
      if(s.length() != 2) return false;
      for(char c : s.toCharArray())
        if(c<'0' || (c>'9' && c<'A') || c>'F') return false;
    }
    return true;
  }


}
