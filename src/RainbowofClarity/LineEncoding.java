package RainbowofClarity;

public class LineEncoding {

  public static void main(String[] args) {
    System.out.println(solution("aaabbbccc"));

  }
  static String solution(String s) {
    int cnt = 1;
    StringBuilder res = new StringBuilder();
    for (int i = 1; i < s.length(); i++) {
      if(s.charAt(i) == s.charAt(i-1)){
        cnt++;
      }else{
        if(cnt > 1){
          res.append(Integer.toString(cnt));
        }
        res.append(s.charAt(i-1));
        cnt = 1;
      }
      if(i == s.length()-1){
        if(cnt > 1){
          res.append(Integer.toString(cnt));
        }
        res.append(s.charAt(i));
      }
    }
    return res.toString();

  }


}
