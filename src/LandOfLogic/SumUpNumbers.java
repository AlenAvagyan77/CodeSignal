package LandOfLogic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumUpNumbers {

  public static void main(String[] args) {
    System.out.println(solution("I have buy 2 eeg, 3 bread and 1 Coca-Cola"));
  }

  static int solution(String inputString) {
    Pattern p = Pattern.compile("[0-9]+");
    Matcher m = p.matcher(inputString);
    int sum = 0;
    while (m.find()){
      int n = Integer.parseInt(m.group());
      sum += n;
    }
    return sum;

  }


}
